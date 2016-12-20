package hu.unideb.inf.fordprog.service.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_listContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Function_clauseContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
import hu.unideb.inf.fordprog.error.ColumnTypeException;
import hu.unideb.inf.fordprog.model.Database;
import hu.unideb.inf.fordprog.model.DatabaseData;
import hu.unideb.inf.fordprog.model.DatabaseRecord;
import hu.unideb.inf.fordprog.model.DatabaseSelectRecord;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;

/**
 * A lekérdezéseket megvalósító szolgáltatás.
 *
 */
public class SelectOperationService extends AbstractOperationService {

    /**
     * Osztály loggere.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TableOperationService.class);

    private static Set<String> functionNames;

    /**
     *
     */
    public SelectOperationService() {
        functionNames = Arrays.asList("sum", "avg", "min", "max", "count").stream().collect(Collectors.toSet());
    }

    /**
     * Lekérdezés végrehajtása kontextus-on keresztül.
     *
     * @param ctx
     *            a lekérdezés kontextusa.
     * @return a lekérdezés eredménye.
     */
    public DatabaseSelectResult selectByContext(final SelectContext ctx) {
        final List<Column_listContext> columns = ctx.columns;
        final String tableName = ctx.tableName.getText();
        DatabaseSelectResult selectResult;
        final List<DatabaseRecord> dataFromTable = Database.getDataFromTable(tableName);
        if (dataFromTable == null) {
            LOGGER.info("Table {} is empty.", tableName);
            return new DatabaseSelectResult();
        }
        if (isFunction(columns)) {
            // Csak az első funkciót kezeljük!
            Column_listContext functionColumn = columns.get(0);
            selectResult = selectWithSpecifiedFunction(functionColumn, dataFromTable);
        } else {
            if (isAsterixColumn(columns)) {
                selectResult = selectAllColumns(tableName, dataFromTable);
            } else {
                checkIfEveryColumnExistsInTable(columns, tableName);
                selectResult = selectWithSpecifiedColumns(columns, dataFromTable);
            }
        }

        return selectResult;
    }

    private DatabaseSelectResult selectWithSpecifiedFunction(Column_listContext functionColumn,
            List<DatabaseRecord> dataFromTable) {
        DatabaseSelectResult selectResult = new DatabaseSelectResult();
        Function_clauseContext functionName = functionColumn.functionName;
        if (functionName != null) {
            String function = functionName.functionLabel.getText();
            List<String> requiredColumns = Arrays.asList(functionColumn.functionName.columnName.getText());
            List<String> requiredFunctionColumns = Arrays.asList(functionColumn.functionName.getText());
            for (DatabaseRecord record : dataFromTable) {
                selectResult.add(createDatabaseSelectRecord(requiredColumns, record));
            }
            DatabaseSelectRecord selectRecord = createSelectRecordByFunction(function, selectResult.getSelectRecords(),
                    requiredFunctionColumns.get(0));
            Set<DatabaseTableColumnDescriptor> resultColumns = createRequiredColumns(requiredFunctionColumns);
            selectResult.setColumns(resultColumns);
            selectResult.setSelectRecords(Arrays.asList(selectRecord));
        }
        return selectResult;
    }

    private DatabaseSelectRecord createSelectRecordByFunction(String function, List<DatabaseSelectRecord> selectRecords,
            String columnName) {
        List<Double> listForOperand = new ArrayList<>();
        for (DatabaseSelectRecord databaseSelectRecord : selectRecords) {
            for (DatabaseData data : databaseSelectRecord.getData()) {
                try {
                    listForOperand.add(Double.valueOf(data.getValue()));
                } catch (NumberFormatException e) {
                    throw new ColumnTypeException("Function parameter's type does not fit!");
                }
            }
        }
        return FunctionHelper.doFunctionOnList(function, listForOperand, columnName);
    }

    private boolean isFunction(List<Column_listContext> columns) {
        List<Column_listContext> functionList = columns.stream()
                .filter(p -> p.functionName != null && functionNames.contains(p.functionName.functionLabel.getText()))
                .collect(Collectors.toList());
        return !functionList.isEmpty();
    }

    private void checkIfEveryColumnExistsInTable(final List<Column_listContext> columns, final String tableName) {
        for (Column_listContext column : columns) {
            Database.isColumnExistsInTable(tableName, column.columName.getText());
        }
    }

    private DatabaseSelectResult selectWithSpecifiedColumns(final List<Column_listContext> columns,
            final List<DatabaseRecord> dataFromTable) {
        DatabaseSelectResult selectResult = new DatabaseSelectResult();
        List<String> requiredColumns = getRequiredColumnsAsStringSet(columns);
        for (DatabaseRecord record : dataFromTable) {
            selectResult.add(createDatabaseSelectRecord(requiredColumns, record));
        }
        Set<DatabaseTableColumnDescriptor> resultColumns = createRequiredColumns(requiredColumns);
        selectResult.setColumns(resultColumns);
        return selectResult;
    }

    private List<String> getRequiredColumnsAsStringSet(final List<Column_listContext> columns) {
        return columns.stream().distinct().map(p -> p.columName.getText()).collect(Collectors.toList());
    }

    private DatabaseSelectRecord createDatabaseSelectRecord(List<String> requiredColumns, DatabaseRecord record) {
        DatabaseSelectRecord databaseSelectRecord = new DatabaseSelectRecord();
        for (DatabaseData data : record.getData()) {
            if (isColumnInRequiredColumns(requiredColumns, data)) {
                databaseSelectRecord.add(data);
            }
        }
        return databaseSelectRecord;
    }

    private Set<DatabaseTableColumnDescriptor> createRequiredColumns(List<String> requiredColumns) {
        Set<DatabaseTableColumnDescriptor> resultColumns = new TreeSet<DatabaseTableColumnDescriptor>();
        Integer rowIndex = 1;
        for (String string : requiredColumns) {
            resultColumns.add(toDatabaseTableColumnDesciptor(string, rowIndex++));
        }
        return resultColumns;
    }

    private boolean isColumnInRequiredColumns(List<String> requiredColumns, DatabaseData data) {
        return requiredColumns.contains(data.getColumnName());
    }

    private DatabaseSelectResult selectAllColumns(final String tableName, final List<DatabaseRecord> dataFromTable) {
        DatabaseSelectResult selectResult = new DatabaseSelectResult();
        Set<DatabaseTableColumnDescriptor> columnsFromTable = Database.getColumnsOrderedFromTable(tableName);
        final List<List<DatabaseData>> data = mapDataFromTableToList(dataFromTable);
        selectResult.setColumns(columnsFromTable);
        data.stream().forEach(dataList -> selectResult.add(new DatabaseSelectRecord(dataList)));
        return selectResult;
    }

    private List<List<DatabaseData>> mapDataFromTableToList(final List<DatabaseRecord> dataFromTable) {
        return dataFromTable.stream().map(p -> p.getData()).collect(Collectors.toList());
    }

    private DatabaseTableColumnDescriptor toDatabaseTableColumnDesciptor(String columnName, Integer index) {
        DatabaseTableColumnDescriptor column = new DatabaseTableColumnDescriptor();
        column.setColumnName(columnName);
        column.setIndex(index);
        return column;
    }

    private boolean isAsterixColumn(final List<Column_listContext> columns) {
        return columns.size() == 1 && isAsterix(columns) ? true : false;

    }

    private boolean isAsterix(final List<Column_listContext> columns) {
        return columns.get(0).columName.getText().equals(ASTERIX);
    }
}

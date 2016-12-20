package hu.unideb.inf.fordprog.service.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_listContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Function_clauseContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.WhereClauseContext;
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

    private final WhereOperationService whereOperationService = new WhereOperationService();

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
        DatabaseSelectResult selectResult = null;
        boolean isFiltered = false;
        boolean isDistincted = false;
        final List<DatabaseRecord> dataFromTable = Database.getDataFromTable(tableName);
        if (dataFromTable == null) {
            LOGGER.info("Table {} is empty.", tableName);
            return new DatabaseSelectResult();
        }
        if (isFunction(columns)) {
            // Csak az első funkciót kezeljük!
            Column_listContext functionColumn = columns.get(0);
            if (shouldFilter(ctx)) {
                selectResult = filterResultBeforeFunctionColumn(ctx, columns, dataFromTable);
                isFiltered = true;
            }
            if (shouldDistinct(ctx)) {
                selectResult = distinctResultBeforeFunctionColumn(columns, selectResult, dataFromTable);
                isDistincted = true;
            }
            selectResult = selectWithSpecifiedFunction(functionColumn,
                    selectResult != null ? mapSelectResultToDatabaseRecord(selectResult) : dataFromTable);
        } else {
            if (isAsterixColumn(columns)) {
                selectResult = selectAllColumns(tableName, dataFromTable);
            } else {
                checkIfEveryColumnExistsInTable(columns, tableName);
                selectResult = selectWithSpecifiedColumns(columns, dataFromTable);
            }
        }
        selectResult.setFiltered(isFiltered);
        selectResult.setDistincted(isDistincted);
        return selectResult;
    }

    private DatabaseSelectResult distinctResultBeforeFunctionColumn(final List<Column_listContext> columns,
            DatabaseSelectResult selectResult, final List<DatabaseRecord> dataFromTable) {
        DatabaseSelectResult result;
        result = selectWithSpecifiedColumnsAndFunction(columns,
                selectResult != null ? mapSelectResultToDatabaseRecord(selectResult) : dataFromTable);
        result = distinctResult(result);
        return result;
    }

    private DatabaseSelectResult filterResultBeforeFunctionColumn(final SelectContext ctx,
            final List<Column_listContext> columns, final List<DatabaseRecord> dataFromTable) {
        DatabaseSelectResult selectResult;
        selectResult = selectWithSpecifiedColumnsAndFunction(columns, dataFromTable);
        selectResult = whereOperationService.filterByContext((WhereClauseContext) ctx.where_clause(), selectResult);
        return selectResult;
    }

    private boolean shouldFilter(SelectContext ctx) {
        return ctx.where != null;
    }

    private List<DatabaseRecord> mapSelectResultToDatabaseRecord(DatabaseSelectResult selectResult) {
        List<DatabaseSelectRecord> selectRecords = selectResult.getSelectRecords();
        List<DatabaseRecord> records = new ArrayList<>();
        for (DatabaseSelectRecord databaseSelectRecord : selectRecords) {
            records.add(new DatabaseRecord(databaseSelectRecord.getData()));
        }
        return records;
    }

    private boolean shouldDistinct(final SelectContext ctx) {
        return ctx.distinct() != null;
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

    private DatabaseSelectResult selectWithSpecifiedColumnsAndFunction(final List<Column_listContext> columns,
            final List<DatabaseRecord> dataFromTable) {
        DatabaseSelectResult selectResult = new DatabaseSelectResult();
        List<String> requiredColumns = getRequiredFunctionColumnsAsStringSet(columns);
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

    private List<String> getRequiredFunctionColumnsAsStringSet(final List<Column_listContext> columns) {
        return columns.stream().distinct().map(p -> p.functionName.columnName.getText()).collect(Collectors.toList());
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

    /**
     *
     * @param result
     * @return
     */
    public DatabaseSelectResult distinctResult(DatabaseSelectResult result) {
        List<DatabaseSelectRecord> okay = result.getSelectRecords().stream().filter(distinctByKey(p -> p))
                .collect(Collectors.toList());
        return new DatabaseSelectResult(result.getColumns(), okay, true, result.isFiltered());
    }

    private <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}

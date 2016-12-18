package hu.unideb.inf.fordprog.service.operation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_listContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
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
     * Lekérdezés végrehajtása kontextus-on keresztül.
     *
     * @param ctx
     *            a lekérdezés kontextusa.
     * @return a lekérdezés eredménye.
     */
    public DatabaseSelectResult selectByContext(final SelectContext ctx) {
        final List<Column_listContext> columns = ctx.columns;
        final DatabaseSelectResult selectResult = new DatabaseSelectResult();
        final String tableName = ctx.tableName.getText();
        final List<DatabaseRecord> dataFromTable = Database.getDataFromTable(tableName);
        Set<DatabaseTableColumnDescriptor> columnsFromTable;

        if (isAsterixColumn(columns)) {
            columnsFromTable = Database.getColumnsOrderedFromTable(tableName);
            final List<List<DatabaseData>> collect = dataFromTable.stream().map(p -> p.getData())
                    .collect(Collectors.toList());
            selectResult.setColumns(columnsFromTable);
            collect.stream().forEach(dataList -> selectResult.add(new DatabaseSelectRecord(dataList)));
        } else {
            Set<String> requiredColumns = columns.stream().distinct().map(p -> p.columName.getText())
                    .collect(Collectors.toSet());
            Integer rowIndex = 1;
            for (DatabaseRecord record : dataFromTable) {
                DatabaseSelectRecord databaseSelectRecord = new DatabaseSelectRecord();
                for (DatabaseData data : record.getData()) {
                    if (requiredColumns.contains(data.getColumnName())) {
                        databaseSelectRecord.add(data);
                    }
                }
                selectResult.add(databaseSelectRecord);
            }
            Set<DatabaseTableColumnDescriptor> resultColumns = new HashSet<>();
            for (String string : requiredColumns) {
                resultColumns.add(toDatabaseTableColumnDesciptor(string, rowIndex++));
            }
            selectResult.setColumns(resultColumns);
        }

        return selectResult;
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

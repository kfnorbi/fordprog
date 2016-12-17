package hu.unideb.inf.fordprog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_definitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_listContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.CreateTableContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertColumnDefinitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertIntoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Insert_column_definitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ValueContext;
import hu.unideb.inf.fordprog.error.ArgumentNumberException;
import hu.unideb.inf.fordprog.error.ColumnTypeException;
import hu.unideb.inf.fordprog.model.Database;
import hu.unideb.inf.fordprog.model.DatabaseData;
import hu.unideb.inf.fordprog.model.DatabaseRecord;
import hu.unideb.inf.fordprog.model.DatabaseSelectRecord;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;
import hu.unideb.inf.fordprog.model.DatabaseTable;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;

/**
 * Szolgáltatás implementáció az adatbázis kezeléséhez.
 *
 */
public class DatabaseServiceImpl implements DatabaseService {

    private static final String ASTERIX = "*";

    private static final String END_REGEX = ".$";

    private static final String EMPTY_CHAR = "";

    private static final String COMA = ",";

    private static final Logger logger = LoggerFactory.getLogger(DatabaseServiceImpl.class);

    public void createTableByContext(CreateTableContext ctx) {
        logger.info("Creating table by context.");
        String table_name = ctx.tableName.getText();
        if (isNotNullContext(table_name)) {
            createTable(ctx, table_name);
        }
    }

    private void createTable(CreateTableContext ctx, String tableName) {
        DatabaseTable table = new DatabaseTable();
        table.setName(tableName);
        List<DatabaseTableColumnDescriptor> columns = createColumnsByContext(ctx.columns);
        table.setColumns(columns);
        Database.addTable(table);
    }

    private boolean isNotNullContext(String table_name) {
        return table_name != null;
    }

    public List<DatabaseTableColumnDescriptor> createColumnsByContext(
            List<Column_definitionContext> columDefinitionContext) {
        List<DatabaseTableColumnDescriptor> result = new ArrayList<>();
        Integer index = 1;
        for (Column_definitionContext columnDefinitionContext : columDefinitionContext) {
            String columnTypeText = columnDefinitionContext.columnType.getText();
            DatabaseTableColumnType type = DatabaseTableColumnType.valueOf(columnTypeText.toUpperCase());
            result.add(new DatabaseTableColumnDescriptor(index++, columnDefinitionContext.columnName.getText(), type));
        }
        return result;
    }

    public void insertIntoByContext(InsertIntoContext ctx) {
        String tableName = ctx.table_name().getText();
        logger.info("Insert into table:{}", tableName);
        List<Insert_column_definitionContext> columns = ctx.insertColumnDefinition;
        List<ValueContext> value = ctx.value();
        checkIfColumnsAndValuesSizeEquals(columns, value);
        insertDataIntoTable(tableName, columns, value);

    }

    private void checkIfColumnsAndValuesSizeEquals(List<Insert_column_definitionContext> columns,
            List<ValueContext> value) {
        if (value.size() != columns.size())
            throw new ArgumentNumberException("Columns and values size are not equals.");
    }

    private void insertDataIntoTable(String tableName, List<Insert_column_definitionContext> columns,
            List<ValueContext> value) {
        List<DatabaseData> datas = new ArrayList<>();
        if (Database.isTableExists(tableName)) {
            for (int i = 0; i < columns.size(); i++) {
                String columnName = ((InsertColumnDefinitionContext) columns.get(i)).columnName.getText();
                insertIfColumnExists(tableName, value, datas, i, columnName);
            }
            Database.insertIntoTable(tableName, new DatabaseRecord(datas));
        }
    }

    private void insertIfColumnExists(String tableName, List<ValueContext> value, List<DatabaseData> datas, int i,
            String columnName) {
        String stringValue = value.get(i).getText();
        stringValue = isEndWithComa(stringValue) ? removeLastCharacter(stringValue) : stringValue;
        if (Database.isColumnExistsInTable(tableName, columnName)) {
            if (DatabaseHelper.isDataEligibleForType(tableName, columnName, stringValue)) {
                datas.add(createDatabaseData(tableName, columnName, stringValue));
            } else {
                logger.error("Value with the column type does not match.");
                throw new ColumnTypeException(createErrorMessage(tableName, columnName, stringValue));
            }
        }
    }

    private DatabaseData createDatabaseData(String tableName, String columnName, String stringValue) {
        DatabaseData data;
        if (DatabaseHelper.isDataEligibleForType(tableName, columnName, stringValue)) {
            stringValue = alterIfVarchar(stringValue);
            DatabaseTableColumnType columnType = getColumnType(tableName, columnName);
            data = new DatabaseData(columnName, columnType, stringValue);
        } else {
            logger.error("Value with the column type does not match.");
            throw new ColumnTypeException(createErrorMessage(tableName, columnName, stringValue));
        }
        return data;
    }

    private DatabaseTableColumnType getColumnType(String tableName, String columnName) {
        return Database.getTableColumnTypeByTableAndColumnName(tableName, columnName);
    }

    private String createErrorMessage(String tableName, String columnName, String stringValue) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Value:");
        stringBuilder.append(stringValue);
        stringBuilder.append(" with the column type:");
        stringBuilder.append(getColumnType(tableName, columnName));
        stringBuilder.append(" does not match ");
        return stringBuilder.toString();
    }

    private String alterIfVarchar(String stringValue) {
        return DatabaseHelper.isVarchar(stringValue) ? DatabaseHelper.removeApostrophes(stringValue) : stringValue;
    }

    private boolean isEndWithComa(String stringValue) {
        return stringValue.endsWith(COMA);
    }

    private String removeLastCharacter(String stringValue) {
        return stringValue.replaceFirst(END_REGEX, EMPTY_CHAR);
    }

    @Override
    public DatabaseSelectResult selectByContext(SelectContext ctx) {
        List<Column_listContext> columns = ctx.columns;
        final DatabaseSelectResult selectResult = new DatabaseSelectResult();
        String tableName = ctx.tableName.getText();
        if (isAsterixColumn(columns)) {
            List<DatabaseRecord> dataFromTable = Database.getDataFromTable(tableName);
            Set<DatabaseTableColumnDescriptor> columnsFromTable = Database.getColumnsOrderedFromTable(tableName);
            List<List<DatabaseData>> collect = dataFromTable.stream().map(p -> p.getData())
                    .collect(Collectors.toList());
            selectResult.setColumns(columnsFromTable);
            collect.stream().forEach(p -> selectResult.add(new DatabaseSelectRecord(p)));
        }
        return selectResult;
    }

    private boolean isAsterixColumn(List<Column_listContext> columns) {
        if (columns.size() == 1 && isAsterix(columns)) {
            return true;
        } else {
            return false;
        }

    }

    private boolean isAsterix(List<Column_listContext> columns) {
        return columns.get(0).columName.getText().equals(ASTERIX);
    }

}

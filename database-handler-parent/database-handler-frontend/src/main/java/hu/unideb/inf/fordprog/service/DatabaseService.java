package hu.unideb.inf.fordprog.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_definitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Create_tableContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Insert_column_definitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Insert_intoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Table_nameContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ValueContext;
import hu.unideb.inf.fordprog.error.ArgumentNumberException;
import hu.unideb.inf.fordprog.error.ColumnTypeException;
import hu.unideb.inf.fordprog.model.Database;
import hu.unideb.inf.fordprog.model.DatabaseData;
import hu.unideb.inf.fordprog.model.DatabaseRecord;
import hu.unideb.inf.fordprog.model.DatabaseTable;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;

/**
 * Service for operate with the database.
 *
 */
public class DatabaseService {

    private static final String END_REGEX = ".$";

    private static final String EMPTY_CHAR = "";

    private static final String COMA = ",";

    private static final Logger logger = LoggerFactory.getLogger(DatabaseService.class);

    public void createTableByContext(Create_tableContext ctx) {
        logger.info("Creating table by context.");
        String table_name = ctx.table_name().getText();
        if (isNotNullContext(table_name)) {
            createTable(ctx, table_name);
        }
    }

    private void createTable(Create_tableContext ctx, String tableName) {
        DatabaseTable table = new DatabaseTable();
        table.setName(tableName);
        List<DatabaseTableColumnDescriptor> columns = createColumnsByContext(ctx.column_definition());
        table.setColumns(columns);
        Database.addTable(table);
    }

    private boolean isNotNullContext(String table_name) {
        return table_name != null;
    }

    public List<DatabaseTableColumnDescriptor> createColumnsByContext(
            List<Column_definitionContext> columDefinitionContext) {
        List<DatabaseTableColumnDescriptor> result = new ArrayList<>();
        for (Column_definitionContext columnDefinitionContext : columDefinitionContext) {
            String columnTypeText = columnDefinitionContext.COLUMN_TPYE().getText();
            DatabaseTableColumnType valueOf = DatabaseTableColumnType.valueOf(columnTypeText.toUpperCase());
            result.add(createNewColumn(columnDefinitionContext.column_name().getText(), valueOf, null));
        }
        return result;
    }

    public DatabaseTableColumnDescriptor createNewColumn(String columName, DatabaseTableColumnType type,
            String modifier) {
        DatabaseTableColumnDescriptor databaseTableColumnDescriptor = new DatabaseTableColumnDescriptor();
        databaseTableColumnDescriptor.setColumnName(columName);
        databaseTableColumnDescriptor.setType(type);
        return databaseTableColumnDescriptor;
    }

    public void insertIntoByContext(Insert_intoContext ctx) {
        Table_nameContext table_name = ctx.table_name();
        String tableName = table_name.getText();
        logger.info("Insert into table:{}", table_name.getText());
        List<Insert_column_definitionContext> columns = ctx.insert_column_definition();
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
        for (int i = 0; i < columns.size(); i++) {
            Insert_column_definitionContext column = columns.get(i);
            String columnName = column.column_name().getText();
            if (Database.isColumnExistsInTable(tableName, columnName)) {
                String stringValue = value.get(i).getText();
                stringValue = isEndWithComa(stringValue) ? removeLastCharacter(stringValue) : stringValue;
                if (DatabaseHelper.isDataEligibleForType(tableName, columnName, stringValue)) {
                    stringValue = alterIfVarchar(stringValue);
                    DatabaseTableColumnType columnType = getColumnType(tableName, columnName);
                    DatabaseData data = new DatabaseData(columnName, columnType, stringValue);
                    datas.add(data);
                } else {
                    logger.error("Value with the column type does not match.");
                    throw new ColumnTypeException(createErrorMessage(tableName, columnName, stringValue));
                }
            }
        }
        Database.insertIntoTable(tableName, new DatabaseRecord(datas));
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

}

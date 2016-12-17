package hu.unideb.inf.fordprog.service.operation;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertColumnDefinitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertIntoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Insert_column_definitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ValueContext;
import hu.unideb.inf.fordprog.error.ArgumentNumberException;
import hu.unideb.inf.fordprog.error.ColumnTypeException;
import hu.unideb.inf.fordprog.model.Database;
import hu.unideb.inf.fordprog.model.DatabaseData;
import hu.unideb.inf.fordprog.model.DatabaseRecord;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;
import hu.unideb.inf.fordprog.service.DatabaseHelper;

/**
 * A beszúrási műveleteket végző szolgáltatás.
 *
 *
 */
public class InsertOperationService extends AbstractOperationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(InsertOperationService.class);

    /**
     * Adat táblába szúrása kontextus alapján.
     *
     * @param ctx
     *            a táblába szúrás kontextusa.
     */
    public void insertIntoByContext(final InsertIntoContext ctx) {
        final String tableName = ctx.table_name().getText();
        LOGGER.info("Insert into table:{}", tableName);
        final List<Insert_column_definitionContext> columns = ctx.insertColumnDefinition;
        final List<ValueContext> value = ctx.value();
        checkIfColumnsAndValuesSizeEquals(columns, value);
        insertDataIntoTable(tableName, columns, value);

    }

    private void checkIfColumnsAndValuesSizeEquals(final List<Insert_column_definitionContext> columns,
            final List<ValueContext> value) {
        if (value.size() != columns.size()) {
            throw new ArgumentNumberException("Columns and values size are not equals.");
        }
    }

    private void insertDataIntoTable(final String tableName, final List<Insert_column_definitionContext> columns,
            final List<ValueContext> value) {
        final List<DatabaseData> datas = new ArrayList<>();
        if (Database.isTableExists(tableName)) {
            for (int i = 0; i < columns.size(); i++) {
                final String columnName = ((InsertColumnDefinitionContext) columns.get(i)).columnName.getText();
                insertIfColumnExists(tableName, value, datas, i, columnName);
            }
            Database.insertIntoTable(tableName, new DatabaseRecord(datas));
        }
    }

    private void insertIfColumnExists(final String tableName, final List<ValueContext> value,
            final List<DatabaseData> datas, final int index, final String columnName) {
        String stringValue = value.get(index).getText();
        stringValue = isEndWithComa(stringValue) ? removeLastCharacter(stringValue) : stringValue;
        if (Database.isColumnExistsInTable(tableName, columnName)) {
            if (DatabaseHelper.isDataEligibleForType(tableName, columnName, stringValue)) {
                datas.add(createDatabaseData(tableName, columnName, stringValue));
            } else {
                LOGGER.error("Value with the column type does not match.");
                throw new ColumnTypeException(createErrorMessage(tableName, columnName, stringValue));
            }
        }
    }

    private DatabaseData createDatabaseData(final String tableName, final String columnName, final String stringValue) {
        DatabaseData data;
        if (DatabaseHelper.isDataEligibleForType(tableName, columnName, stringValue)) {
            final String value = alterIfVarchar(stringValue);
            final DatabaseTableColumnType columnType = getColumnType(tableName, columnName);
            data = new DatabaseData(columnName, columnType, value);
        } else {
            LOGGER.error("Value with the column type does not match.");
            throw new ColumnTypeException(createErrorMessage(tableName, columnName, stringValue));
        }
        return data;
    }

    private DatabaseTableColumnType getColumnType(final String tableName, final String columnName) {
        return Database.getTableColumnTypeByTableAndColumnName(tableName, columnName);
    }

    private String createErrorMessage(final String tableName, final String columnName, final String stringValue) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Value:");
        stringBuilder.append(stringValue);
        stringBuilder.append(" with the column type:");
        stringBuilder.append(getColumnType(tableName, columnName));
        stringBuilder.append(" does not match ");
        return stringBuilder.toString();
    }

    private String alterIfVarchar(final String stringValue) {
        return DatabaseHelper.isVarchar(stringValue) ? DatabaseHelper.removeApostrophes(stringValue) : stringValue;
    }

    private boolean isEndWithComa(final String stringValue) {
        return stringValue.endsWith(COMA);
    }

    private String removeLastCharacter(final String stringValue) {
        return stringValue.replaceFirst(END_REGEX, EMPTY_CHAR);
    }

}

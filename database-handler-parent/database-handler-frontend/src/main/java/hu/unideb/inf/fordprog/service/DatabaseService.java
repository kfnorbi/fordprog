package hu.unideb.inf.fordprog.service;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Column_definitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Create_tableContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Insert_column_definitionContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Insert_intoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.Table_nameContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.ValueContext;
import hu.unideb.inf.fordprog.model.Database;
import hu.unideb.inf.fordprog.model.DatabaseTable;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;

/**
 * Service for operate with the database.
 *
 */
public class DatabaseService {

    public void createTableByContext(Create_tableContext ctx) {
        String table_name = ctx.table_name().getText();
        if (isNotNullContext(table_name)) {
            DatabaseTable tableByName = Database.getTableByName(table_name);
            if (isTableNull(tableByName)) {
                createTable(ctx, table_name);
            } else {
                throw new RuntimeException("Table with " + table_name + " is already exixts.");
            }
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

    private boolean isTableNull(DatabaseTable tableByName) {
        return tableByName == null;
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
        System.out.println("Insert into table:" + table_name.getText());
        List<Insert_column_definitionContext> insert_column_definition = ctx.insert_column_definition();
        for (Insert_column_definitionContext insert_column_definitionContext : insert_column_definition) {
            String text = insert_column_definitionContext.column_name().getText();
            System.out.println("Column name: " + text);
        }
        List<ValueContext> value = ctx.value();
        for (ValueContext valueContext : value) {
            TerminalNode char1 = valueContext.CHAR();
            System.out.println("TerminalNode:" + char1.getText());
        }
    }

}

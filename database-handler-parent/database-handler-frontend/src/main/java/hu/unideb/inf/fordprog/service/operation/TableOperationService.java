package hu.unideb.inf.fordprog.service.operation;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.CreateTableContext;
import hu.unideb.inf.fordprog.model.Database;
import hu.unideb.inf.fordprog.model.DatabaseTable;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;

/**
 * A tábla műveleteket megvalósító szolgáltatás.
 *
 *
 */
public class TableOperationService {

    /**
     * Osztály loggere.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TableOperationService.class);

    /**
     * Oszlop műveleteket megvalósító szolgáltatás.
     */
    private ColumnOperationService columnService = new ColumnOperationService();

    /**
     * Tábla létrehozása kontextus alapján.
     *
     * @param ctx
     *            a tábla létrehozásásához szükséges kontextus.
     */
    public void createTableByContext(final CreateTableContext ctx) {
        LOGGER.info("Creating table by context.");
        final String tableName = ctx.tableName.getText();
        if (isNotNullContext(tableName)) {
            createTable(ctx, tableName);
        }
    }

    private void createTable(CreateTableContext ctx, String tableName) {
        final DatabaseTable table = new DatabaseTable();
        table.setName(tableName);
        final List<DatabaseTableColumnDescriptor> columns = columnService.createColumnsByContext(ctx.columns);
        table.setColumns(columns);
        Database.addTable(table);
    }

    private boolean isNotNullContext(final String tableName) {
        return tableName != null;
    }
}

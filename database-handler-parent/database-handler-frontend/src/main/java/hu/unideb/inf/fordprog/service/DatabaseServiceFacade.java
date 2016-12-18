package hu.unideb.inf.fordprog.service;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.CreateTableContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertIntoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.WhereClauseContext;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;

/**
 * Szolgáltatás facade megvalósítás.
 *
 */
public class DatabaseServiceFacade implements DatabaseService {

    /**
     * Szolgáltatás.
     */
    private final DatabaseService service = new DatabaseServiceImpl();

    /**
     * {@inheritDoc}
     */
    @Override
    public void createTableByContext(final CreateTableContext ctx) {
        service.createTableByContext(ctx);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void insertIntoByContext(final InsertIntoContext ctx) {
        service.insertIntoByContext(ctx);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabaseSelectResult selectByContext(final SelectContext ctx) {
        return service.selectByContext(ctx);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabaseSelectResult filterResultByWhereContext(WhereClauseContext ctx,DatabaseSelectResult selectResult) {
        return service.filterResultByWhereContext(ctx, selectResult);
    }

    public DatabaseService getService() {
        return service;
    }

}

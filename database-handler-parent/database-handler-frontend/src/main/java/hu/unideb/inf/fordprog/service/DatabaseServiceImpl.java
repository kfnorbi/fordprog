package hu.unideb.inf.fordprog.service;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.CreateTableContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertIntoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.WhereClauseContext;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;
import hu.unideb.inf.fordprog.service.operation.InsertOperationService;
import hu.unideb.inf.fordprog.service.operation.SelectOperationService;
import hu.unideb.inf.fordprog.service.operation.TableOperationService;
import hu.unideb.inf.fordprog.service.operation.WhereOperationService;

/**
 * Szolgáltatás implementáció az adatbázis kezeléséhez.
 *
 */
public class DatabaseServiceImpl implements DatabaseService {

    /**
     * Tábla műveletek szolgáltatása.
     */
    private final TableOperationService tableService = new TableOperationService();

    /**
     * Táblába szúrás műveletek szolgáltatása.
     */
    private final InsertOperationService insertService = new InsertOperationService();

    /**
     * Lekérdezéseket segítő szolgáltatás.
     */
    private final SelectOperationService selectOperationService = new SelectOperationService();

    /**
     * Lekérdezéseket segítő szolgáltatás.
     */
    private final WhereOperationService whereOperationService = new WhereOperationService();

    /**
     * {@inheritDoc}
     */
    @Override
    public void createTableByContext(CreateTableContext ctx) {
        tableService.createTableByContext(ctx);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void insertIntoByContext(InsertIntoContext ctx) {
        insertService.insertIntoByContext(ctx);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabaseSelectResult selectByContext(SelectContext ctx) {
        return selectOperationService.selectByContext(ctx);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatabaseSelectResult filterResultByWhereContext(WhereClauseContext ctx, DatabaseSelectResult selectResult) {
        return whereOperationService.filterByContext(ctx, selectResult);
    }

    public TableOperationService getTableService() {
        return tableService;
    }

    public InsertOperationService getInsertService() {
        return insertService;
    }

    public SelectOperationService getSelectOperationService() {
        return selectOperationService;
    }

}

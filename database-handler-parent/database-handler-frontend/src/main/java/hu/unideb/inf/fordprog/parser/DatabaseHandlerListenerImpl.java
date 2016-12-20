package hu.unideb.inf.fordprog.parser;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.CreateTableContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertIntoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.WhereClauseContext;
import hu.unideb.inf.fordprog.model.DatabaseSelectCache;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;
import hu.unideb.inf.fordprog.service.DatabaseService;
import hu.unideb.inf.fordprog.service.DatabaseServiceFacade;
import hu.unideb.inf.fordprog.service.display.DisplayService;

/**
 * Adatbázis műveleteket kontextuson való megvalósítását leíró osztály.
 *
 *
 */
public class DatabaseHandlerListenerImpl extends AbstractDatabaseHandlerListener {

    /**
     * Adatbázis szolgáltatás.
     */
    private DatabaseService service = new DatabaseServiceFacade();

    /**
     * Megjelenítésért felelős szolgáltatás.
     */
    private DisplayService displayService = new DisplayService();

    @Override
    public void exitCreateTable(CreateTableContext ctx) {
        service.createTableByContext(ctx);
    }

    @Override
    public void exitInsertInto(InsertIntoContext ctx) {
        service.insertIntoByContext(ctx);
    }

    @Override
    public void exitSelect(SelectContext ctx) {
        DatabaseSelectResult selectResult = service.selectByContext(ctx);
        if (ctx.where != null && !selectResult.isFiltered()) {
            selectResult = service.filterResultByWhereContext((WhereClauseContext) ctx.where, selectResult);
        }
        if (ctx.distinct() != null && !selectResult.isDistincted()) {
            selectResult = service.distinctResult(selectResult);
        }

        DatabaseSelectCache.setDatabaseCache(selectResult);
        displayService.displayResult();
    }

}

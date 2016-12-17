package hu.unideb.inf.fordprog.service;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.CreateTableContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertIntoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;

/**
 * Szolgáltatás facade megvalósítás.
 *
 */
public class DatabaseServiceFacade implements DatabaseService {

    DatabaseService service = new DatabaseServiceImpl();

    @Override
    public void createTableByContext(CreateTableContext ctx) {
        service.createTableByContext(ctx);
    }

    @Override
    public void insertIntoByContext(InsertIntoContext ctx) {
        service.insertIntoByContext(ctx);
    }

    @Override
    public DatabaseSelectResult selectByContext(SelectContext ctx) {
        return service.selectByContext(ctx);
    }

}

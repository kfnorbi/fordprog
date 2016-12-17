package hu.unideb.inf.fordprog.service;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.CreateTableContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.InsertIntoContext;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser.SelectContext;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;

/**
 * Az alapvető adatbázis műveletek megvalósító szolgáltatás leírása.
 *
 *
 */
public interface DatabaseService {

    /**
     * Tábla elkészítése kontextus alapján.
     *
     * @param ctx
     *            a tábla készítés kontextusa.
     */
    void createTableByContext(CreateTableContext ctx);

    /**
     * Adat beszúrás kontextus alapján.
     *
     * @param ctx
     *            az beszúrás kontextusa.
     */
    void insertIntoByContext(InsertIntoContext ctx);

    /**
     * Lekérdezés kontextus alapján.
     *
     * @param ctx
     *            a lekérdezés kontextusa.
     * @return a lekérdezés eredménye.
     */
    DatabaseSelectResult selectByContext(SelectContext ctx);
}

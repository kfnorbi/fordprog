package hu.unideb.inf.fordprog.interpreter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerLexer;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser;
import hu.unideb.inf.fordprog.error.SQLException;
import hu.unideb.inf.fordprog.error.SyntaxErrorException;
import hu.unideb.inf.fordprog.parser.DatabaseHandlerListenerImpl;

/**
 * Az adatbázis interpretere.
 *
 */
public final class DatabaseInterpreter {

    /**
     * Osztály loggere.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseInterpreter.class);

    private DatabaseInterpreter() {
    }

    /**
     * Parancs interpretálása.
     *
     * @param command
     *            a parancs.
     */
    public static void interpret(final String command) {
        final DatabaseHandlerLexer lexer = new DatabaseHandlerLexer(new ANTLRInputStream(command));
        final DatabaseHandlerParser parser = new DatabaseHandlerParser(new CommonTokenStream(lexer));
        parser.addParseListener(new DatabaseHandlerListenerImpl());
        try {
            parser.sql_statement();
        } catch (SQLException e) {
            LOGGER.error(e.getMessage());
            throw e;
        }
        final Integer numberOfErrors = parser.getNumberOfSyntaxErrors();
        if (numberOfErrors > 0) {
            throw new SyntaxErrorException("Syntax error!");
        }
    }

}

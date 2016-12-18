package hu.unideb.inf.fordprog.interpreter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerLexer;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser;
import hu.unideb.inf.fordprog.error.SyntaxErrorException;
import hu.unideb.inf.fordprog.parser.DatabaseHandlerListenerImpl;

/**
 * Az adatbázis interpretere.
 *
 */
public final class DatabaseInterpreter {

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
        parser.sql_statement();
        final Integer numberOfErrors = parser.getNumberOfSyntaxErrors();
        if (numberOfErrors > 0) {
            throw new SyntaxErrorException("Syntax error!");
        }
    }

}

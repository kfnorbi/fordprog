package hu.unideb.inf.fordprog.interpreter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerLexer;
import hu.unideb.inf.fordprog.antlr4.DatabaseHandlerParser;
import hu.unideb.inf.fordprog.parser.DatabaseHandlerListenerImpl;

public final class DatabaseInterpreter {

    public static void interpret(String command) {
        DatabaseHandlerLexer lexer = new DatabaseHandlerLexer(new ANTLRInputStream(command));
        DatabaseHandlerParser parser = new DatabaseHandlerParser(new CommonTokenStream(lexer));
        parser.addParseListener(new DatabaseHandlerListenerImpl());
        parser.sql_statement();
        int numberOfSyntaxErrors = parser.getNumberOfSyntaxErrors();
        if (numberOfSyntaxErrors > 0) {
            throw new RuntimeException("Syntax error!");
        }
    }

}

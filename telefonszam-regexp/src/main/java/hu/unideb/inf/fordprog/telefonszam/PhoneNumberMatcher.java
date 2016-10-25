package hu.unideb.inf.fordprog.telefonszam;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import generated.TelefonszamLexer;
import generated.TelefonszamParser;
import generated.TelefonszamParser.EvalContext;


public class PhoneNumberMatcher {

    private static final String REGEXP = ""
            + "(^\\+?\\d{2}?(-?\\d-?\\d{3}-?\\d{3}|" 
            + "-\\d{2}-\\d{3}-\\d{2}-\\d{2}|"
            + "-\\d{2}-\\d{3}-\\d{4}|" 
            + "-\\d{2}-\\d{2}-\\d{2}-\\d{3}|" 
            + "-\\d{2}-\\d{4}-\\d{3}|"
            + "-\\d{2}-\\d{3}-\\d{3}|" 
            + "-\\d{2}-\\d{6}|" 
            + "\\d{9}|" 
            + "-\\d{2}-\\d{7}))";

    public static boolean match(String phoneNumber) {
        try {
            TelefonszamLexer lexer = new TelefonszamLexer(new ANTLRInputStream(phoneNumber));
//            lexer.removeErrorListeners();
            lexer.addErrorListener(new CustomAntlrErrorListener());
            TelefonszamParser parser = new TelefonszamParser(new CommonTokenStream(lexer));
            EvalContext eval = parser.eval();
//            System.out.println(parser.getNumberOfSyntaxErrors());
            if(eval.exception != null || parser.getNumberOfSyntaxErrors() != 0)
                return false;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

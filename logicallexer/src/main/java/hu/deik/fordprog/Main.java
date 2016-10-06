package hu.deik.fordprog;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static enum TokenType {
        BINCON("[>|&|\\|]"), VAR("[a-z]"), UNCON("[\\-]");

        public final String pattern;

        private TokenType(String pattern) {
            this.pattern = pattern;
        }
    }

    public static class Token {
        public TokenType type;
        public String data;

        public Token(TokenType type, String data) {
            this.type = type;
            this.data = data;
        }

        @Override
        public String toString() {
            return String.format("(%s %s)", type.name(), data);
        }
    }

    public static ArrayList<Token> lex(String input) {
        ArrayList<Token> tokens = new ArrayList<Token>();

        StringBuffer tokenPatternsBuffer = new StringBuffer();
        for (TokenType tokenType : TokenType.values())
            tokenPatternsBuffer.append(String.format("|(?<%s>%s)", tokenType.name(), tokenType.pattern));
        Pattern tokenPatterns = Pattern.compile(new String(tokenPatternsBuffer.substring(1)));

        Matcher matcher = tokenPatterns.matcher(input);
        while (matcher.find()) {
            if (matcher.group(TokenType.BINCON.name()) != null) {
                tokens.add(new Token(TokenType.BINCON, matcher.group(TokenType.BINCON.name())));
                continue;
            } else if (matcher.group(TokenType.VAR.name()) != null) {
                tokens.add(new Token(TokenType.VAR, matcher.group(TokenType.VAR.name())));
                continue;
            } else if (matcher.group(TokenType.UNCON.name()) != null)
                continue;
        }

        return tokens;
    }

    public static void main(String[] args) {
        String input = "-(p>q)&r|(-q)";

        ArrayList<Token> tokens = lex(input);
        for (Token token : tokens)
            System.out.println(token);
    }
}

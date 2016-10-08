package hu.deik.fordprog;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicalLexer {
    public enum TokenType {
        BINCON("[>|&|\\|]"), VAR("[a-z]"), UNCON("[\\-]");

        public final String pattern;

        private TokenType(String pattern) {
            this.pattern = pattern;
        }
    }

    public class Token {
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

    // JUST AN EXAMPLE - how to use group and formatted regexp.
    public ArrayList<Token> lex(String input) {
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

    public String lexToString(String input) {
        StringBuilder result = new StringBuilder();
        StringBuffer tokenPatternsBuffer = new StringBuffer();
        for (TokenType tokenType : TokenType.values())
            tokenPatternsBuffer.append(String.format("|(?<%s>%s)", tokenType.name(), tokenType.pattern));
        Pattern tokenPatterns = Pattern.compile(new String(tokenPatternsBuffer.substring(1)));

        for (int i = 0; i < input.length(); i++) {

            String character = String.valueOf(input.charAt(i));
            Matcher matcher = tokenPatterns.matcher(character);
            if (matcher.matches()) {
                if (matcher.group(TokenType.BINCON.name()) != null) {
                    result.append(TokenType.BINCON.name());
                } else if (matcher.group(TokenType.VAR.name()) != null) {
                    result.append(TokenType.VAR.name());
                } else if (matcher.group(TokenType.UNCON.name()) != null) {
                    result.append(TokenType.UNCON.name());
                }

            } else {
                result.append(character);
            }
            result.append(" ");
        }
        return result.toString();

    }
}

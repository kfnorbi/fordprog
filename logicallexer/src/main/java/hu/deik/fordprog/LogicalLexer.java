package hu.deik.fordprog;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicalLexer {
    // JUST AN EXAMPLE - how to use group and formatted regexp.
    public ArrayList<Token> lex(String input) {
        ArrayList<Token> tokens = new ArrayList<Token>();

        StringBuffer tokenPatternsBuffer = new StringBuffer();
        for (TokenType tokenType : TokenType.values())
            tokenPatternsBuffer.append(String.format("|(?<%s>%s)", tokenType.name(), tokenType.pattern));
        Pattern tokenPatterns = Pattern.compile(new String(tokenPatternsBuffer.substring(1)));

        Matcher matcher = tokenPatterns.matcher(input);
        while (matcher.find()) {
//            if (matcher.group(TokenType.BINCON.name()) != null) {
//                tokens.add(new Token(TokenType.BINCON, matcher.group(TokenType.BINCON.name())));
//                continue;
//            } else if (matcher.group(TokenType.VAR.name()) != null) {
//                tokens.add(new Token(TokenType.VAR, matcher.group(TokenType.VAR.name())));
//                continue;
//            } else if (matcher.group(TokenType.UNCON.name()) != null)
//                continue;
        	for (TokenType type : TokenType.values()){
        		if (matcher.group(type.name()) != null){
        			tokens.add(new Token(type, matcher.group(type.name())));
        		}
        	}
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

            char charAt = input.charAt(i);
            String character = String.valueOf(charAt);
            Matcher matcher = tokenPatterns.matcher(character);
            if (matcher.matches()) {
            	//refactored
//                if (matcher.group(TokenType.BINCON.name()) != null) {
//                    result.append(TokenType.BINCON.name());
//                } else if (matcher.group(TokenType.VAR.name()) != null) {
//                    result.append(TokenType.VAR.name());
//                } else if (matcher.group(TokenType.UNCON.name()) != null) {
//                    result.append(TokenType.UNCON.name());
//                } else if (matcher.group(TokenType.ETC.name()) != null) {
//                    result.append(charAt);
//                }
            	for (TokenType type : TokenType.values()){
            		if (matcher.group(type.name()) != null){
            			result.append(type.name());
            		}
            	}
            } else {
                return "ERROR!";
            }
            if (!Character.isWhitespace(charAt))
                result.append(" ");
        }
        return result.toString().trim();

    }
}

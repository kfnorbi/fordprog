package hu.deik.fordprog;

public class Main {

    public static void main(String[] args) {
        LogicalLexer lexer = new LogicalLexer();
        String input = "-(p>q)&r|(-q)";
        String output = lexer.lexToString(input);
        System.out.println(output);
    }
}

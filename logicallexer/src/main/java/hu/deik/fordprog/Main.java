package hu.deik.fordprog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LogicalLexer lexer = new LogicalLexer();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String output = lexer.lexToString(line);
            System.out.println(output);
        }
        sc.close();
    }
}

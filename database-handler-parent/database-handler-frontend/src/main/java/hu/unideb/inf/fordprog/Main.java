package hu.unideb.inf.fordprog;

import java.util.Scanner;

import hu.unideb.inf.fordprog.interpreter.DatabaseInterpreter;

public class Main {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            try {
                DatabaseInterpreter.interpret(sc.next());
            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }

}

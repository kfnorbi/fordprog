package hu.unideb.inf.fordprog;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.fordprog.error.SyntaxErrorException;
import hu.unideb.inf.fordprog.interpreter.DatabaseInterpreter;

/**
 * Konzolos applikáció.
 *
 */
public final class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    private Main() {

    }

    /**
     * Konzolos alkalmazás belépési pontja.
     *
     * @param args
     */
    public static void main(String... args) {
        final Scanner inputScanner = new Scanner(System.in);
        while (inputScanner.hasNext()) {
            try {
                DatabaseInterpreter.interpret(inputScanner.next());
            } catch (SyntaxErrorException e) {
                LOGGER.error("Error", e);
            }
        }
        inputScanner.close();
    }

}

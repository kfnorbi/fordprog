package hu.deik.fordprog;

import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import generated.LogicLexer;
import generated.LogicParser;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			try {
				LogicLexer lexer = new LogicLexer(new ANTLRInputStream(sc.nextLine()));
				lexer.removeErrorListeners();
				lexer.addErrorListener(new CustomAntlrErrorListener());
				LogicParser parser = new LogicParser(new CommonTokenStream(lexer));
				parser.expression();
				System.out.println("OK");
			} catch (RuntimeException e) {
				System.out.println("hibás");
			}
		}
		sc.close();
	}
}

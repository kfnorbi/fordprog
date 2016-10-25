package hu.unideb.inf.fordprog;

import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import generated.HetedhetLexer;
import generated.HetedhetParser;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			try {
				HetedhetLexer lexer = new HetedhetLexer(new ANTLRInputStream(sc.nextLine()));
				lexer.removeErrorListeners();
				lexer.addErrorListener(new CustomAntlrErrorListener());
				HetedhetParser parser = new HetedhetParser(new CommonTokenStream(lexer));
				parser.eval();
				System.out.println("OK");
			} catch (RuntimeException e) {
				System.out.println("hibás");
			}
		}
		sc.close();
	}
}

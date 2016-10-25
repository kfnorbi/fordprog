package hu.unideb.inf.fordprog;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.HetedhetLexer;
import generated.HetedhetParser;

public class Main {
	public static void main(String... args) {
		try {
			HetedhetLexer lexer = new HetedhetLexer(new ANTLRInputStream("6666x7^55"));
			lexer.removeErrorListeners();
			lexer.addErrorListener(new CustomAntlrErrorListener());
			HetedhetParser parser = new HetedhetParser(new CommonTokenStream(lexer));
			parser.eval();
			System.out.println("OK");
		} catch (RuntimeException e) {
			System.out.println("hibás");
		}
	}
}

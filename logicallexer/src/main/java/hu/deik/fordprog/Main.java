package hu.deik.fordprog;

import java.util.Scanner;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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
				ParseTree tree = parser.expression();
				LogicalBaseVisitor visitor = new LogicalBaseVisitor();
				System.out.println(visitor.visit(tree));
			} catch (RuntimeException e) {
				System.err.println(e);
			}
		}
		sc.close();
	}
}

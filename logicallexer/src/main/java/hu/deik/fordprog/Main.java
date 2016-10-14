package hu.deik.fordprog;

import java.util.List;
import java.util.Scanner;

import hu.deik.fordprog.semantics.RDPChecker;

public class Main {

	public static void main(String[] args) {
		LogicalLexer lexer = new LogicalLexer();
		Scanner sc = new Scanner(System.in);
		RDPChecker checker = new RDPChecker();
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			List<Token> output = lexer.lex(line);
			System.out.println(checker.check(output)?"Elfogadva":"Elutasitva");
			System.out.println(output);
		}
		sc.close();
	}
}

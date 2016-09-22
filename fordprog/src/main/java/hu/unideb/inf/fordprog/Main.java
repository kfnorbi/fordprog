package hu.unideb.inf.fordprog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import hu.unideb.inf.fordprog.library.Abc;
import hu.unideb.inf.fordprog.library.Language;
import hu.unideb.inf.fordprog.library.ParseResult;
import hu.unideb.inf.fordprog.library.StateTransitionMethod;
import hu.unideb.inf.fordprog.library.parser.ParseException;

public class Main {
	public static void main(String... args) {
		Abc abc = new Abc("-.0123456");

		StateTransitionMethod<Character> method = null;
		try {
			method = new SevenStateTransitionMethod("hetes_szamrendszer.xml");
		} catch (ParseException e) {
			System.err.println("Hiba történt a fájl szabályleíró feldolgozása során");
			System.exit(1);
		} catch (FileNotFoundException e) {
			System.err.println("Nem található a keresett fájl");
			System.exit(1);
		}

		Language language = new Language(abc, method);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String buffer = ".";
		while (!"".equals(buffer)) {
			try {
				buffer = br.readLine();
				ParseResult<Character> result = language.parse(buffer);
				System.out.println("\tEredmény:" + result.isAccepted());
			} catch (IOException e) {
				System.err.println("Hiba történt a beolvasás során");
			
			}
		}

		language.parse("-122.122");

	}
}

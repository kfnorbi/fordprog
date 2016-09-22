package hu.unideb.inf.fordprog.library;

import java.util.ArrayList;
import java.util.List;

public class Abc {

	List<Character> characters;

	public Abc(String chars) {
		characters = new ArrayList<>();
		for (Character character : chars.toCharArray()) {
			characters.add(character);
		}
	}

	public boolean contains(char character) {
		for (Character abcelement : characters) {
			if (abcelement.equals(characters)) {
				return true;
			}
		}
		return false;
	}

}

package hu.unideb.inf.fordprog.library.parser;

import java.util.ArrayList;
import java.util.List;

public class WeakState<T> {

	private int id;

	private T input;

	private List<WeakStateTransition<T>> rules;

	
	
	public WeakState() {
		rules = new ArrayList<>();
	}

	public T getInput() {
		return input;
	}

	public void setInput(T input) {
		this.input = input;
	}

	public List<WeakStateTransition<T>> getRules() {
		return rules;
	}

	public void addRule(WeakStateTransition<T> rule) {
		rules.add(rule);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

package hu.unideb.inf.fordprog.library;

import java.util.ArrayList;
import java.util.List;

public class ParseResult<T> {

	private List<State> result;

	private boolean accepted;

	public ParseResult() {
		super();
		this.result = new ArrayList<>();
		this.accepted = true;
	}

	public List<State> getResult() {
		return result;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public void addResultElement(State state) {
		result.add(state);
	}

}

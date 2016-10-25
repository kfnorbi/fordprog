package hu.unideb.inf.fordprog.library.parser;

public class WeakStateTransition<T> {

	private T input;

	private Integer to;

	public T getInput() {
		return input;
	}

	public void setInput(T input) {
		this.input = input;
	}

	public int getTo() {
		return to;
	}

	public void setTo(int to) {
		this.to = to;
	}

}

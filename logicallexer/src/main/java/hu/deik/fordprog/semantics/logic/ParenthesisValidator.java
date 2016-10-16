package hu.deik.fordprog.semantics.logic;

public class ParenthesisValidator {

	private Integer counter;

	public ParenthesisValidator() {
		this.counter = 0;
	}

	public void openParenthesis() {
		counter++;
	}

	public void closeParenthesis() throws InvalidParenthesisException {
		if (counter == 0) {
			throw new InvalidParenthesisException();
		}
		counter--;
	}
	
	public boolean isClear(){
		return counter.equals(0);
	}

}

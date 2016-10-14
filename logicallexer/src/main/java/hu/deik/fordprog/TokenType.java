package hu.deik.fordprog;

public enum TokenType {
	OR("\\|"), IMPLICATION(">"), AND("&"), VAR("[a-z|A-Z]"), NEGATE("[\\-]"), INDENT("\\s"), LEFTPARENTHESIS(
			"\\("), RIGHTPARENTHESIS("\\)");

	public final String pattern;

	private TokenType(String pattern) {
		this.pattern = pattern;
	}
}
package hu.deik.fordprog;

public class Token {
	private TokenType type;
	private String data;

	public Token(TokenType type, String data) {
		this.type = type;
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("(%s %s)", type.name(), data);
	}

	public TokenType getType() {
		return type;
	}

	public void setType(TokenType type) {
		this.type = type;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
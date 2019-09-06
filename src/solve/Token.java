package solve;

public class Token {

	private TokenType type;
	private String value;

	public Token(String value, TokenType type) {
		this.value = value;
		this.type = type;
	}

	public TokenType getType() {
		return (type);
	}

	public String getValue() {
		return (value);
	}

}

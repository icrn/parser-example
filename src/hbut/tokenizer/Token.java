package hbut.tokenizer;

/**
 * Created by yan on 2016/10/24.
 */
public class Token {

    private String value;

    private TokenType type;

    public Token(TokenType type,String value) {
        this.value = value;
        this.type = type;
    }

    public Token(TokenType aNull, Object type) {

    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TokenType getType() {
        return type;
    }

    public void setType(TokenType type) {
        this.type = type;
    }
}

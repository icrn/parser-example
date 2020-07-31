package cn.icrn.tokenizer;

/**
 * Created by yan on 2016/10/24.
 */
public class Token {

    private String value;

    private TokenType type;

    public Token(TokenType type,String value) {
        this.type = type;
        this.value = value;
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

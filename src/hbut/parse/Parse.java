package hbut.parse;

import hbut.exception.JsonParseException;
import hbut.tokenizer.TokenType;
import hbut.tokenizer.Tokenizer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2016/10/24.
 */
public class Parse {

    private Tokenizer tokenizer;

    public Parse(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    public static Object parseJSONObject(String jsonString) throws IOException, JsonParseException {
        Tokenizer tokenizer = new Tokenizer(new BufferedReader(new StringReader(jsonString)));
        tokenizer.tokenizer();
        Parse parser = new Parse(tokenizer);
        return parser.object();
    }

    private JObject object() throws JsonParseException {
        tokenizer.next();
        Map<String,Value> map = new HashMap<String,Value>();
        if(isToken(TokenType.END_OBJ)){
            tokenizer.next();
            return new JObject(map);
        }else if(isToken(TokenType.STRING)){
            map = key(map);
        }
        return new JObject(map);
    }

    private Map<String, Value> key(Map<String, Value> map) throws JsonParseException {
        String key = tokenizer.next().getValue();
        if(isToken(TokenType.COLON)){
            throw new JsonParseException("Invalid JSON object");
        }else {
            tokenizer.next();
            if(isPrimary()){
                Value primary = new Primary(tokenizer.peek(0).getValue());
                map.put(key,primary);
            }else if(isToken(TokenType.START_ARRAY)){
                Value array = array();
                map.put(key,array);
            }
            if(isToken(TokenType.COMMA)){
                tokenizer.next(); //consume ','
                if(isToken(TokenType.STRING))
                    map = key(map);
            }else if(isToken(TokenType.END_OBJ)){
                tokenizer.next();
                return map;
            }

        }
        return map;
    }

    private JArray array() throws JsonParseException {
        tokenizer.next(); //consume '['
        List<Json> list = new ArrayList<>();
        JArray array = null;
        if (isToken(TokenType.START_ARRAY)) {
            array = array();
            list.add(array);
            if (isToken(TokenType.COMMA)) {
                tokenizer.next(); //consume ','
                list = element(list);
            }
        } else if (isPrimary()) {
            list = element(list);
        } else if (isToken(TokenType.START_OBJ)) {
            list.add( object());
            while (isToken(TokenType.COMMA)) {
                tokenizer.next(); //consume ','
                list.add( object());
            }
        } else if (isToken(TokenType.END_ARRAY)) {
            tokenizer.next(); //consume ']'
            array =  new JArray(list);
            return array;
        }
        tokenizer.next(); //consume ']'
        array = new JArray(list);
        return array;
    }

    private List<Json> element(List<Json> list) throws JsonParseException {
        list.add(new Primary(tokenizer.next().getValue()));
        if (isToken(TokenType.COMMA)) {
            tokenizer.next(); //consume ','
            if (isPrimary()) {
                list = element(list);
            } else if (isToken(TokenType.START_OBJ)) {
                list.add(object());
            } else if (isToken(TokenType.START_ARRAY)) {
                list.add(array());
            } else {
                throw new JsonParseException("Invalid JSON input.");
            }
        } else if (isToken(TokenType.END_ARRAY)) {
            return list;
        } else {
            throw new JsonParseException("Invalid JSON input.");
        }
        return list;
    }


    private boolean isPrimary() {
        TokenType type = tokenizer.peek(0).getType();
        return type == TokenType.BOOLEAN || type == TokenType.NULL  ||
                type == TokenType.NUMBER || type == TokenType.STRING;
    }

    private boolean isToken(TokenType startObj) {
        return tokenizer.peek(0).getType()==startObj;
    }

}

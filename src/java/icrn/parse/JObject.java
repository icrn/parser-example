package icrn.parse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yan on 2016/10/24.
 */
public class JObject implements Json {

    private Map<String, Value> map = new HashMap<>();

    public JObject(Map<String, Value> map) {
        this.map = map;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        int size = map.size();
        for (String key : map.keySet()) {
            sb.append(key + " : " + map.get(key));
            if (--size != 0) {
                sb.append(", ");
            }
        }
        sb.append(" }");
        return sb.toString();
    }


}

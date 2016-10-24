package cn;

import cn.parse.JsonParse;
import cn.result.JsonResult;

/**
 * Created by yan on 2016/10/22.
 */
public class Json {

    String json;

    public Json(){
    }

    public Json(String json) {
        this.json = json;
    }

    public String getJson() {

        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public JsonResult parseJson(String json){
        JsonParse jp = new JsonParse(json);
        return jp.fromJson();
    }

}

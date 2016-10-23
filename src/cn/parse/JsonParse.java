package cn.parse;

import cn.result.JsonResult;
import cn.result.impl.JsonResultImpl;
import cn.result.info.JsonResultInfo;
import com.company.JsonValue;

/**
 * Created by yan on 2016/10/22.
 */
public class JsonParse {

    private JsonResultInfo jResultInfo;

    private String json;

    public JsonParse(String json) {
        this.json = json;
    }


    public JsonResult fromJson() {
        if(json==null)
            throw new RuntimeException("not value");
        char[] ch = json.toCharArray();
        if(ch[0]!= JsonValue.jsonListBegin.value()&&ch[0]!=JsonValue.jsonMapBegin.value()){
            throw new RuntimeException("not value");
        }
        JsonInfo JInfo = new JsonInfo();
        JsonResultImpl jResult = new JsonResultImpl();
        jResultInfo = jResult.getzResultInfo();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<ch.length;i++){
            char temp = ch[i];
            if(!JInfo.isMark()&&temp == JsonValue.jsonListBegin.value()){

                continue;
            }else if(!JInfo.isMark() && temp == JsonValue.jsonMapBegin.value()){
                //
                continue;
            }else if(temp == '\\'){
                //
                continue;
            }
        }
        return jResult;
    }
}

package cn.parse;

import cn.JsonUtil;
import cn.result.JsonResult;
import cn.result.impl.JsonResultImpl;
import cn.result.info.JsonResultInfo;
import com.company.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

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
                handleListBegin(JInfo);
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

    private void handleListBegin(JsonInfo JInfo) {
        String key = addToCollections(1);
    }

    private String addToCollections(int type) {
        if(type==0)
            jResultInfo.getCollections().add(new HashMap<String,Object>());
        else if(type == 1)
            jResultInfo.getCollections().add(new ArrayList<Objects>());
        int status = 0;
        int index  = 0;
        String key = JsonUtil.BEGIN_KEY;
        if(jResultInfo.getLevel().size()!=0){
            index = jResultInfo.getCollections().size()-1;
            int latestIndex = getLatestFinishedLevelIndex();
            key = generateIndexKey(jResultInfo.getLevel().get(latestIndex));

        }
        return key;
    }

    private String generateIndexKey(String parentKey) {
        int begin = 1;
        while(true){
            if(jResultInfo.getIndex().containsKey(parentKey+"."+begin)){
                begin++;
            }else{
                return parentKey+"."+begin;
            }
        }
    }

    private int getLatestFinishedLevelIndex(){
        for (int i = jResultInfo.getLevel().size()-1; i >= 0; i--) {
            if(jResultInfo.getIndex().get(jResultInfo.getLevel().get(i)).get(JsonUtil.STATUS)==0){
                return i;
            }
        }
        return -1;
    }
}

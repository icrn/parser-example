package cn.result.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2016/10/22.
 */
public class JsonResultInfo {

    private boolean valid = true;

    private List<Object> collections = new ArrayList<>();

    private Map<String,Map<String,Integer>> index = new HashMap<>();

    private boolean allfinished = false;

    private List<String> level = new ArrayList<>();

    private List<Object> result= new ArrayList<>();

    private List<Object> resultsTemp = new ArrayList<Object>();

    private List<String> resultLevel = new ArrayList<String>();

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public List<Object> getCollections() {
        return collections;
    }

    public void setCollections(List<Object> collections) {
        this.collections = collections;
    }

    public Map<String, Map<String, Integer>> getIndex() {
        return index;
    }

    public void setIndex(Map<String, Map<String, Integer>> index) {
        this.index = index;
    }

    public boolean isAllfinished() {
        return allfinished;
    }

    public void setAllfinished(boolean allfinished) {
        this.allfinished = allfinished;
    }

    public List<String> getLevel() {
        return level;
    }

    public void setLevel(List<String> level) {
        this.level = level;
    }

    public List<Object> getResult() {
        return result;
    }

    public void setResult(List<Object> result) {
        this.result = result;
    }

    public List<Object> getResultsTemp() {
        return resultsTemp;
    }

    public void setResultsTemp(List<Object> resultsTemp) {
        this.resultsTemp = resultsTemp;
    }

    public List<String> getResultLevel() {
        return resultLevel;
    }

    public void setResultLevel(List<String> resultLevel) {
        this.resultLevel = resultLevel;
    }
}

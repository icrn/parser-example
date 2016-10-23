package cn.result.impl;

import cn.result.JsonResult;
import cn.result.JsonResultAbstract;

import java.util.List;
import java.util.Map;

/**
 * Created by yan on 2016/10/22.
 */
public class JsonResultImpl extends JsonResultAbstract implements JsonResult {
    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public Object getValue(String path) {
        return null;
    }

    @Override
    public Object getResult() {
        return null;
    }

    @Override
    public List<Object> getValues(String path) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(String path) {
        return null;
    }

    @Override
    public List<Object> getList(String path) {
        return null;
    }

    @Override
    public String toJsonString(Object obj) {
        return null;
    }

    @Override
    public String getString(String path) {
        return null;
    }

    @Override
    public int getInteger(String path) {
        return 0;
    }

    @Override
    public long getLong(String path) {
        return 0;
    }

    @Override
    public double getDouble(String path) {
        return 0;
    }

    @Override
    public float getFloat(String path) {
        return 0;
    }

    @Override
    public boolean getBoolean(String path) {
        return false;
    }

    @Override
    public void removeValue(String path) {

    }

    @Override
    public void updateValue(String path, Object value) {

    }
}

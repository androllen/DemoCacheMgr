package com.cc.democachemgr.request;

public abstract class CacheAbleRequestJsonHandler extends CacheAbleRequestDefaultHandler<JsonData> {

    @Override
    public JsonData processOriginData(JsonData jsonData) {
        return jsonData;
    }
}
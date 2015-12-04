package com.cc.democachemgr.request;

public abstract class RequestJsonHandler extends RequestDefaultHandler<JsonData> {

    @Override
    public JsonData processOriginData(JsonData jsonData) {
        return jsonData;
    }
}
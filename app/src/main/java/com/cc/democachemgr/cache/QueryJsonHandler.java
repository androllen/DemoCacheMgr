package com.cc.democachemgr.cache;

import com.cc.democachemgr.util.JsonData;

public abstract class QueryJsonHandler implements QueryHandler<JsonData> {

    @Override
    public JsonData processRawDataFromCache(JsonData rawData) {
        return rawData;
    }
}

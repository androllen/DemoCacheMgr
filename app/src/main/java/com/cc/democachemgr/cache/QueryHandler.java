package com.cc.democachemgr.cache;

import com.cc.democachemgr.util.JsonData;

public interface QueryHandler<T> {

    /**
     * We need to process the data from data source, do some filter of convert the structure.
     * <p/>
     * As the "Assert Data" is a special data source, we also need to do the same work.
     */
    public T processRawDataFromCache(JsonData rawData);

    /**
     * when query finish
     *
     * @param cacheData
     * @param outOfDate
     */
    public void onQueryFinish(Query.RequestType requestType, T cacheData, boolean outOfDate);

    /**
     * create data when cache data is no existent
     */
    public String createDataForCache(Query<T> query);
}

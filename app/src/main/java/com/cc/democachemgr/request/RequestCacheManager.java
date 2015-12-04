package com.cc.democachemgr.request;

import android.content.Context;

import com.cc.democachemgr.cache.CacheManager;

public class RequestCacheManager {

    private static CacheManager sInstance;

    public static CacheManager getInstance() {
        if (sInstance == null) {
            throw new RuntimeException("Call RequestCacheManager::init() first");
        }
        return sInstance;
    }

    public static void init(Context content, String cacheDir, int memoryCacheSizeInKB, int fileCacheSizeInKB) {
        sInstance = new CacheManager(content, cacheDir, memoryCacheSizeInKB, fileCacheSizeInKB);
    }
}

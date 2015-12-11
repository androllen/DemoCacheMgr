package com.cc.democachemgr;

import android.app.Application;
import android.os.Environment;

import com.cc.democachemgr.cache.CacheManager;
import com.cc.democachemgr.cache.CacheManagerFactory;
import com.cc.democachemgr.image.ImageLoaderFactory;
import com.cc.democachemgr.image.impl.DefaultImageLoadHandler;
import com.cc.democachemgr.image.impl.DefaultImageReSizer;

import com.cc.democachemgr.util.LocalDisplay;
import com.cc.democachemgr.util.NetworkStatusManager;

import java.io.File;

/**
 * Created by androllen on 15/12/4.
 */
public class CubeDemoApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        LocalDisplay.init(getApplicationContext());

        // network status
        NetworkStatusManager.init(getApplicationContext());

        CacheManager.init(getApplicationContext());
        initImageLoader();

        //RequestManager.getInstance().setRequestProxyFactory(DemoRequestProxy.getInstance());
        // init local cache, just use default
        CacheManagerFactory.initDefaultCache(this, null, -1, -1);
    }
    private void initImageLoader() {

        File path1 = Environment.getExternalStoragePublicDirectory("cube/test1/a/b/c");
        ImageLoaderFactory.customizeCache(
                this,
                // memory size
                1024 * 10,
                // disk cache directory
                path1.getAbsolutePath(),
                //null,
                // disk cache size
                ImageLoaderFactory.DEFAULT_FILE_CACHE_SIZE_IN_KB
        );

        DefaultImageLoadHandler handler = new DefaultImageLoadHandler(this);
        // handler.setLoadingImageColor("#999999");

        ImageLoaderFactory.setDefaultImageLoadHandler(handler);
        ImageLoaderFactory.setDefaultImageReSizer(DefaultImageReSizer.getInstance());
    }

}

package com.cc.democachemgr.image.impl;

import com.cc.democachemgr.image.ImageLoadRequest;
import com.cc.democachemgr.image.iface.NameGenerator;

public class DefaultNameGenerator implements NameGenerator {

    private static DefaultNameGenerator sInstance;

    public static synchronized DefaultNameGenerator getInstance() {
        if (sInstance == null) {
            sInstance = new DefaultNameGenerator();
        }
        return sInstance;
    }

    @Override
    public String generateIdentityUrlFor(ImageLoadRequest request) {
        return request.getUrl();
    }
}

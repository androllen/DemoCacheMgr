package com.cc.democachemgr.image.iface;

import com.cc.democachemgr.image.ImageLoadRequest;

public interface NameGenerator {

    /**
     * @param request
     * @return
     */
    public String generateIdentityUrlFor(ImageLoadRequest request);
}

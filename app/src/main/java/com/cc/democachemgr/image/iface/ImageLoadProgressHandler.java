package com.cc.democachemgr.image.iface;

import com.cc.democachemgr.image.CubeImageView;
import com.cc.democachemgr.image.ImageTask;

/**
 * Define load progress
 */
public interface ImageLoadProgressHandler {

    void onProgressChange(ImageTask imageTask, CubeImageView cubeImageView, int loaded, int total);
}

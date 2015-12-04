package com.cc.democachemgr.image.iface;

import com.cc.democachemgr.image.ImageTask;
import com.cc.democachemgr.image.ImageTaskStatistics;

public interface ImageLoadProfiler {
    public void onImageLoaded(ImageTask imageTask, ImageTaskStatistics stat);
}

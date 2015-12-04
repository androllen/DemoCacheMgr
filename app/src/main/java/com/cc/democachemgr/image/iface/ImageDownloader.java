package com.cc.democachemgr.image.iface;

import java.io.OutputStream;

import com.cc.democachemgr.image.ImageTask;

public interface ImageDownloader {

    public boolean downloadToStream(ImageTask imageTask,
                                    String url,
                                    OutputStream outputStream,
                                    ProgressUpdateHandler progressUpdateHandler);
}
package com.cc.democachemgr.image;

import com.cc.democachemgr.image.iface.ImageLoadProfiler;

public class ImagePerformanceStatistics {

    private static int sSAMPLE_NUM = 0;
    private static ImageLoadProfiler sImageLoadProfiler;

    public static void setSample(int num) {
        sSAMPLE_NUM = num;
    }

    public static boolean sample(int id) {
        return sSAMPLE_NUM != 0 && id % sSAMPLE_NUM == 0;
    }

    /**
     * @param profiler
     */
    @SuppressWarnings({"unused"})
    public static void setImageLoadProfile(ImageLoadProfiler profiler) {
        sImageLoadProfiler = profiler;
    }

    public static void onImageLoaded(ImageTask task, ImageTaskStatistics stat) {
        if (sImageLoadProfiler != null) {
            sImageLoadProfiler.onImageLoaded(task, stat);
        }
    }
}
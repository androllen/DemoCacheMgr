package com.cc.democachemgr.view;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.cc.democachemgr.R;
import com.cc.democachemgr.image.CubeImageView;
import com.cc.democachemgr.image.ImageLoader;
import com.cc.democachemgr.image.ImageLoaderFactory;
import com.cc.democachemgr.image.ImageTask;
import com.cc.democachemgr.image.impl.DefaultImageLoadHandler;
import com.cc.democachemgr.util.LocalDisplay;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private CubeImageView mCubeImageView;
    private String mUrl = "http://cube-sdk.liaohuqiu.net/assets/img/qrcode.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_main);

        mCubeImageView=(CubeImageView)findViewById(R.id.image_rounded_image_view1);
        DefaultImageLoadHandler defaultImageLoadHandler = new DefaultImageLoadHandler(getApplicationContext()) {
            @Override
            public void onLoadFinish(ImageTask imageTask, CubeImageView imageView, BitmapDrawable drawable) {
                super.onLoadFinish(imageTask, imageView, drawable);
                //loadRoundedImage();
            }
        };
        ImageLoader imageLoaderDefault = ImageLoaderFactory.create(getApplicationContext(), defaultImageLoadHandler);
        mCubeImageView.loadImage(imageLoaderDefault, mUrl);

    }
//    private void loadRoundedImage() {
//
//        DefaultImageLoadHandler defaultImageLoadHandler = new DefaultImageLoadHandler(getContext());
//        defaultImageLoadHandler.setImageRounded(true, LocalDisplay.dp2px(50));
//        ImageLoader roundedImageLoader = ImageLoaderFactory.create(getContext(), defaultImageLoadHandler);
//        mRoundedImageView.loadImage(roundedImageLoader, mUrl);
//    }


}

package com.example.pengxl.pxlmvpmdel.utils;

import android.content.Context;
import android.widget.ImageView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by pengxl on 2017-4-12.
 */

public class ImageLoader {
    Context mContext;

    public ImageLoader(Context mContext) {
        this.mContext = mContext;
    }

    void imageLoader(int resId, ImageView view) {
        SimpleDraweeView view1=new SimpleDraweeView(mContext);
//        view1.setImageURI();
    }

    void imageLoader(String url, ImageView view) {

    }

    void imageLoader(int resId, ImageView view, boolean isCache) {

    }

    void imageLoader(String url, ImageView view, boolean isCache) {

    }
}

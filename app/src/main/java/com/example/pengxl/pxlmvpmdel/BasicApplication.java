package com.example.pengxl.pxlmvpmdel;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.stetho.Stetho;

/**
 * Created by pengxl on 2017-1-9.
 */
public class BasicApplication extends Application {
    private static BasicConfig config;
    private static BasicApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
        Fresco.initialize(getApplicationContext());
        instance = this;
    }

    public BasicConfig getConfig() {
        return config;
    }

    public void setConfig(BasicConfig config) {
        this.config = config;
    }

    public static BasicApplication getInstance() {
        return instance;
    }
}

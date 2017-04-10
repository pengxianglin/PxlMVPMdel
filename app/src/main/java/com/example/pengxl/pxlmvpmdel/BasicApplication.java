package com.example.pengxl.pxlmvpmdel;

import android.app.Application;

/**
 * Created by pengxl on 2017-1-9.
 */
public class BasicApplication extends Application {
    private static BasicConfig config;
    private static BasicApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
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
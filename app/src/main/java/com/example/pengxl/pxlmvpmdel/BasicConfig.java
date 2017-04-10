package com.example.pengxl.pxlmvpmdel;

import android.content.Context;

/**
 * 基础配置类，
 * 网络访问路径，
 * 文件访问路径，
 * 数据库访问路径，
 * Created by pengxl on 2017-1-9.
 */
public class BasicConfig {
    public String configApiUrl() {
        return null;
    }

    public String configFileUrl() {
        return null;
    }

    public Context configContext() {
        return BasicApplication.getInstance();
    }
}

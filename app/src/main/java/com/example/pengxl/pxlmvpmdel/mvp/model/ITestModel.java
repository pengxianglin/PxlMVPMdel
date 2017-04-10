package com.example.pengxl.pxlmvpmdel.mvp.model;

import com.example.pengxl.pxlmvpmdel.base.subscribers.NextSubscriber;
import com.example.pengxl.pxlmvpmdel.mvp.model.entity.Test;

import java.util.List;

/**
 * Created by pengxl on 2017-2-23.
 */
public interface ITestModel {
    void getData(NextSubscriber<List<Test>> subscriber);
}

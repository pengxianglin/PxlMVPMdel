package com.example.pengxl.pxlmvpmdel.mvp.model;

import com.example.pengxl.pxlmvpmdel.base.http.HttpMethods;
import com.example.pengxl.pxlmvpmdel.base.mvp.BaseModel;
import com.example.pengxl.pxlmvpmdel.base.subscribers.NextSubscriber;
import com.example.pengxl.pxlmvpmdel.mvp.model.entity.Test;

import java.util.List;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by pengxl on 2017-2-23.
 */
public class TestModel extends BaseModel implements ITestModel {
    @Override
    public void getData(NextSubscriber<List<Test>> subscriber) {
        Observable observable = HttpMethods.getInstance().apiService.getTopMovie(10, 10)
                .map(new HttpResultFunc<List<Test>>());
        toSubscribe(observable, subscriber);
    }

}

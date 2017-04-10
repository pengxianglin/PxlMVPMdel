package com.example.pengxl.pxlmvpmdel.mvp.presenter;

import com.example.pengxl.pxlmvpmdel.base.mvp.BasePresenter;
import com.example.pengxl.pxlmvpmdel.base.mvp.IView;
import com.example.pengxl.pxlmvpmdel.base.subscribers.INextSubscriber;
import com.example.pengxl.pxlmvpmdel.base.subscribers.NextSubscriber;
import com.example.pengxl.pxlmvpmdel.mvp.model.TestModel;
import com.example.pengxl.pxlmvpmdel.mvp.model.entity.Test;
import com.example.pengxl.pxlmvpmdel.mvp.ui.MainActivity;

import java.util.List;

import retrofit2.http.GET;
import rx.Subscriber;

/**
 * Created by pengxl on 2017-2-23.
 */
public class MainPresenter extends BasePresenter<TestModel, MainActivity> implements IMainPresenter {
    private TestModel model;

    public MainPresenter(MainActivity view) {
        super(view);
        model = new TestModel();
    }
    @Override
    public void performOnClick() {
        model.getData(new NextSubscriber<List<Test>>(new INextSubscriber<List<Test>>() {
            @Override
            public void onNext(List<Test> o) {
                view.setData(o);
            }
        }, view.getContext()));
    }
}

package com.example.pengxl.pxlmvpmdel.base.mvp;

/**
 * Created by pengxl on 2017-2-23.
 */
public class BasePresenter<M extends IModel, V extends IView> implements IPresenter<V> {
    protected V view;

    protected BasePresenter(V view) {
        this.view = view;
    }
}

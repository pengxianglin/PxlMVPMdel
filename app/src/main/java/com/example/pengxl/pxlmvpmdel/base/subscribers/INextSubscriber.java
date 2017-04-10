package com.example.pengxl.pxlmvpmdel.base.subscribers;

/**
 * Created by liukun on 16/3/10.
 */
public interface INextSubscriber<T> {
    void onNext(T t);
}

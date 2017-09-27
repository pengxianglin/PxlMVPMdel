package com.example.pengxl.pxlmvpmdel.mvp.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.pengxl.pxlmvpmdel.R;
import com.example.pengxl.pxlmvpmdel.base.mvp.BaseActivity;
import com.example.pengxl.pxlmvpmdel.mvp.adapter.MainAdapter;
import com.example.pengxl.pxlmvpmdel.mvp.model.entity.Test;
import com.example.pengxl.pxlmvpmdel.mvp.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;
import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainActivity extends BaseActivity<MainPresenter> implements IMainActivity {

    @Bind(R.id.list_img)
    RecyclerView mRecyclerView;
    Observable<List<Test>> observable;
    Observer<String> observer;

    @OnClick(R.id.btn_send)
    public void OnSend() {
        getPresenter().performOnClick();
    }

    @Override
    protected MainPresenter initPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {

            }
        };


    }

    @Override
    public void setData(List<Test> test) {
        observable.just(test).map(new Func1<List<Test>, List<String>>() {
            @Override
            public List<String> call(List<Test> s) {
                List<String> urls = new ArrayList<>();
                for (Test t : s) {
                    urls.add(t.getImages().getLarge());
                }
                return urls;
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread()).subscribe(new Action1<List<String>>() {
            @Override
            public void call(List<String> strings) {
                mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                mRecyclerView.setAdapter(new MainAdapter(strings, getContext()));
            }
        });
    }
}

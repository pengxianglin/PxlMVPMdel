package com.example.pengxl.pxlmvpmdel.base.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.pengxl.pxlmvpmdel.mvp.presenter.IMainPresenter;
import com.example.pengxl.pxlmvpmdel.mvp.presenter.MainPresenter;

import butterknife.ButterKnife;

/**
 * Created by pengxl on 2017-2-21.
 */
public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity implements IView {

    P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        presenter = initPresenter();
    }

    protected P getPresenter() {
        return presenter;
    }

    protected abstract P initPresenter();

    @Override
    public void showErrorMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context getContext() {
        return this;
    }
}

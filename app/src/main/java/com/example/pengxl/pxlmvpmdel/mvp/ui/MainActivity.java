package com.example.pengxl.pxlmvpmdel.mvp.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.example.pengxl.pxlmvpmdel.R;
import com.example.pengxl.pxlmvpmdel.base.mvp.BaseActivity;
import com.example.pengxl.pxlmvpmdel.mvp.model.entity.Test;
import com.example.pengxl.pxlmvpmdel.mvp.presenter.IMainPresenter;
import com.example.pengxl.pxlmvpmdel.mvp.presenter.MainPresenter;


import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity<MainPresenter> implements IMainActivity {

    @Bind(R.id.tv_context)
    TextView tvContext;
    private IMainPresenter presenter;
zs
    @OnClick(R.id.btn_send)
    public void OnSend() {
        presenter.performOnClick();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void initPresenter() {
        super.initPresenter();
        presenter = new MainPresenter(this);
    }

    @Override
    public void setData(List<Test> test) {
        showMessage(test.toString());
    }
}

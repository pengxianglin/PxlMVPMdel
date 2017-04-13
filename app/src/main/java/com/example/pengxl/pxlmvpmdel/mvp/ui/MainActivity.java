package com.example.pengxl.pxlmvpmdel.mvp.ui;

import android.os.Bundle;
import android.widget.ListView;
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

    @Bind(R.id.list_img)
    ListView list_img;
    private IMainPresenter presenter;
    @OnClick(R.id.btn_send)
    public void OnSend() {
        presenter.performOnClick();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
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

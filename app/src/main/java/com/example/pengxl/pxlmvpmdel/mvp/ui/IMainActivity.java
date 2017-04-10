package com.example.pengxl.pxlmvpmdel.mvp.ui;

import com.example.pengxl.pxlmvpmdel.base.mvp.IView;
import com.example.pengxl.pxlmvpmdel.mvp.model.entity.Test;

import java.util.List;

/**
 * Created by pengxl on 2017-2-21.
 */
public interface IMainActivity extends IView {
    void setData(List<Test> test);
}

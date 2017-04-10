package com.example.pengxl.pxlmvpmdel.base.mvp;

import android.content.Context;

/**
 * Created by pengxl on 2017-2-21.
 */
public interface IView {

    void showErrorMsg(String msg);

    void showMessage(String msg);

    Context getContext();
}

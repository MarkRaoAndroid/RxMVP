package com.rzj.mvp.view;


import android.app.Activity;

public interface IBaseView {

    void showLoading();

    void dismissLoading();

    void showError(String msg);

    Activity getContext();
}

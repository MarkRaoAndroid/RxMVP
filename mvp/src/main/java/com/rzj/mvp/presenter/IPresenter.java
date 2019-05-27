package com.rzj.mvp.presenter;


import com.rzj.mvp.view.IBaseView;

public interface IPresenter<V extends IBaseView> {
    void start();
    void attachView(V view);
    void detachView();
}

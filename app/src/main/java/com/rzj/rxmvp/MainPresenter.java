package com.rzj.rxmvp;

import com.rzj.mvp.api.BaseObserver;
import com.rzj.mvp.presenter.BasePresenter;
import com.rzj.rxmvp.bean.LogonBean;
import com.rzj.rxmvp.contract.MainContract;
import com.rzj.rxmvp.model.MainModel;

public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    private MainModel mainModel;

    public MainPresenter() {
        mainModel = new MainModel();
    }

    @Override
    public void start() {

    }

    @Override
    public void logon(String... params) {
        addDisposable(mainModel.getBean(params), new BaseObserver<LogonBean>() {

            @Override
            public void onComplete() {

            }

            @Override
            public void onFailure(String msg) {

            }

            @Override
            public void onSuccess(LogonBean data) {

            }
        });
    }
}

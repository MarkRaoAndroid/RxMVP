package com.rzj.rxmvp.contract;

import com.rzj.mvp.view.IBaseView;

public interface MainContract {
    interface View extends IBaseView{}
    interface Presenter{
       void logon(String... params);
    }
}

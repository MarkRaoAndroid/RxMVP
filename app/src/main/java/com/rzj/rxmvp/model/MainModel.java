package com.rzj.rxmvp.model;

import com.rzj.mvp.model.BaseModel;
import com.rzj.mvp.model.BaseRespond;
import com.rzj.rxmvp.api.LogonApi;
import com.rzj.rxmvp.bean.LogonBean;

import java.io.IOException;

import io.reactivex.Observable;

public class MainModel extends BaseModel<LogonApi, LogonBean> {
    @Override
    public LogonApi getApi() {
        return new LogonApi();
    }

    @Override
    public Observable<BaseRespond<LogonBean>> getBean(String... params){
        return getApi().getData(params);
    }
}

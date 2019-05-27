package com.rzj.rxmvp;

import android.app.Application;

import com.rzj.mvp.api.Api;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Api.initApi("你的baseUrl");
    }
}

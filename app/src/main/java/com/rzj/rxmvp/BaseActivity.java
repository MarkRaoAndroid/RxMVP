package com.rzj.rxmvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Toast;

public abstract class BaseActivity extends AppCompatActivity {

    protected FragmentActivity mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        this.mContext = this;
        initDatas();
        initViews();
        initPresenter();
    }

    public void toast(String msg) {
        if(!TextUtils.isEmpty(msg)){
            Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show();
        }
    }

    protected void initPresenter() {}

    public abstract void initViews();

    public abstract void initDatas();

    public abstract int getLayoutId();
}

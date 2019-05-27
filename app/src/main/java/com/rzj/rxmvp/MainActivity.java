package com.rzj.rxmvp;

import com.rzj.rxmvp.contract.MainContract;

public class MainActivity extends MVPActivity<MainPresenter> implements MainContract.View {


    @Override
    public void initViews() {

    }

    @Override
    public void initDatas() {
        mPresenter.logon("张三", "密码123");
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }
}

package com.rzj.mvp.presenter;


import com.rzj.mvp.view.IBaseView;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;


public abstract class BasePresenter<T extends IBaseView> implements IPresenter<T> {

    private T mView;
    protected T mProxyView;

    private CompositeDisposable mDisposable;

    private void unSubscribe() {
        if (mDisposable != null) {
            mDisposable.dispose();
        }
    }

    /**
     * 添加被观察对象并开始请求
     *
     * @param subscription
     */
    protected void addDisposable(Observable observable, DisposableObserver subscription) {
        if (mDisposable == null) {
            mDisposable = new CompositeDisposable();
        }
        mDisposable.add(subscription);
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(subscription);
    }

    @Override
    public void attachView(T view) {
        this.mView = view;
        this.mProxyView = (T) Proxy.newProxyInstance(view.getClass().getClassLoader(),
                view.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 执行这个方法，调用者是代理对象
                        if (null == mView) {
                            return null;
                        }
                        // 表示不为空 View 没有解绑，则由 View 来执行
                        return method.invoke(mView, args);
                    }
                });
    }

    @Override
    public void detachView() {
        mProxyView = null;
        mView = null;
        unSubscribe();
    }
}

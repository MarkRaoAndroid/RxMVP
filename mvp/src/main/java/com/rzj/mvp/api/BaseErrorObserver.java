package com.rzj.mvp.api;

import io.reactivex.observers.DisposableObserver;
import retrofit2.HttpException;

/**
 * 基类处理错误
 * @param <M>
 */
public abstract class BaseErrorObserver<M> extends DisposableObserver<M> {

    public abstract void onFailure(String msg);

    @Override
    public void onError(Throwable throwable) {
        if (null == throwable) {
            return;
        }
        throwable.printStackTrace();
        if (throwable instanceof HttpException) {
            HttpException httpException = (HttpException) throwable;
            String msg;
            int code = httpException.code();
            if (code == 504) {
                msg = "网络不给力";
            } else if (code == 502 || code == 404) {
                msg = "服务器异常，请稍后再试";
            } else {
                msg = httpException.getMessage();
            }
            onFailure(msg);
        } else {
            onFailure(throwable.getMessage());
        }
    }
}

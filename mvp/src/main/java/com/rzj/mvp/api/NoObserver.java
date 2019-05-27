package com.rzj.mvp.api;

/**
 * 兼容不符合标准格式数据的返回
 *
 * @param <M>
 */
public abstract class NoObserver<M> extends BaseErrorObserver<M> {

    public abstract void onSuccess(M data);

    @Override
    public void onNext(M m) {
        onSuccess(m);
    }

}

package com.rzj.mvp.model;

import java.io.IOException;

import io.reactivex.Observable;

/**
 * 兼容不符合标准格式的数据
 */
public abstract class Model<T, E> {
    public abstract T getApi();

    public abstract Observable<E> getBean(String... params) throws IOException;
}

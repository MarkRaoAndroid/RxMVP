package com.rzj.mvp.api;


import io.reactivex.Observable;

/**
 * 兼容那些不符合标准格式的返回数据
 *
 * @param <T>
 */
public abstract class NoApi<T> {

    public abstract Observable<T> getData(String... params);

}

package com.rzj.mvp.api;





import com.rzj.mvp.model.BaseRespond;

import io.reactivex.Observable;


/**
 * 标准带有 状态码、提示语 和 data
 * @param <T>
 */
public abstract class BaseApi<T> {
    public abstract Observable<BaseRespond<T>> getData(String... params);
}

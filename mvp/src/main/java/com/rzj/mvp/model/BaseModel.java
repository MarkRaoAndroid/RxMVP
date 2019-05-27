package com.rzj.mvp.model;


import io.reactivex.Observable;

public abstract class BaseModel<T, E> {
    public abstract T getApi();

    public abstract Observable<BaseRespond<E>> getBean(String... params);
}

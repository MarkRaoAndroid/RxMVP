package com.rzj.mvp.api;


import com.rzj.mvp.model.BaseRespond;

public abstract class BaseObserver<M> extends BaseErrorObserver<BaseRespond<M>> {

    public abstract void onSuccess(M data);

    @Override
    public void onNext(BaseRespond<M> value) {
        if (null == value) {
            onFailure( "数据异常");
        } else {
            if (value.getCode() == 2000) {
                onSuccess(value.getData());
            } else {
                onFailure(value.getMsg());
            }
        }
    }
}

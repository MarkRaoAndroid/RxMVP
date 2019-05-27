package com.rzj.rxmvp.api;

import com.rzj.mvp.api.Api;
import com.rzj.mvp.api.BaseApi;
import com.rzj.mvp.model.BaseRespond;
import com.rzj.rxmvp.bean.LogonBean;
import java.util.HashMap;
import java.util.Map;
import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public class LogonApi extends BaseApi<LogonBean> {

    @Override
    public Observable<BaseRespond<LogonBean>> getData(String... params) {
        if (null == params || params.length < 3) {
            return null;
        }
        Map<String, String> map = new HashMap<>(params.length);
        map.put("mobile", params[0]);
        map.put("code", params[1]);
        map.put("device_token", params[2]);
        return Api.create(LogonApiService.class).logon(map);
    }

    public interface LogonApiService {
        @POST("index/login/")
        Observable<BaseRespond<LogonBean>> logon(@QueryMap Map<String, String> params);
    }
}

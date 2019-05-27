package com.rzj.mvp.api;

import android.text.TextUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {
    // 设置 3000 毫秒连接超时
    private static final int DEFAULT_TIMEOUT = 3000;
    private static OkHttpClient mOkHttpClient;
    private static String BASE_URL;
    private static Retrofit mRetrofit;

    private Api() {
    }

    public static <T> T create(Class<T> apiServiceClass) {
        if (null == apiServiceClass) {
            throw new RuntimeException("apiServiceClass must no be null");
        }
        if (null == mRetrofit) {
            throw new RuntimeException("Api must no be init");
        }
        return mRetrofit.create(apiServiceClass);
    }

    public static void initApi(String baseUrl) {
        if(TextUtils.isEmpty(baseUrl)){
            throw new RuntimeException("baseUrl must no be null");
        }
        if(!TextUtils.isEmpty(BASE_URL)){
            throw new RuntimeException("Api has been initialized");
        }
        BASE_URL = baseUrl;
        mOkHttpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
                .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
                .build();

        mRetrofit = new Retrofit.Builder()
                .client(mOkHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build();
    }
}

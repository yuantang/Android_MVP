package com.example.tom.android_mvp.model;

import okhttp3.OkHttpClient;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by tom on 2016/3/25.
 */
public class AppCliet {
    private static final String baseUrl="http://www.weather.com.cn/";

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder builder=new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create());
    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }
}

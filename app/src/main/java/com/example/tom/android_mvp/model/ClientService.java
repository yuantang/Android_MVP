package com.example.tom.android_mvp.model;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tom on 2016/3/25.
 */
public interface ClientService {
    @GET("data/sk/101010100.html")
    Call<WeatherBean> getWeather();
}

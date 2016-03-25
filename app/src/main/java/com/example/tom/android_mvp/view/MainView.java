package com.example.tom.android_mvp.view;

import com.example.tom.android_mvp.model.WeatherBean;

/**
 * Created by tom on 2016/3/25.
 */
public interface MainView {
    void showData(WeatherBean weatherInfo);
    void showProgress();
    void hideProgress();
}

package com.example.tom.android_mvp.presenter;

/**
 * Created by tom on 2016/3/25.
 * 此接口连接view
 */
public interface IPresenterToView<V> {
    void attachview(V view);
    void detacview();
}

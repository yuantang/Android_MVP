package com.example.tom.android_mvp.presenter;

/**
 * Created by tom on 2016/3/25.
 *
 * 此接口连接model
 */
public interface IPresenterToModle<T> {
    void loadDataSuccess(T data);
    void loadDataFailure();
}

package com.example.tom.android_mvp.presenter;

import com.example.tom.android_mvp.model.WeatherBean;
import com.example.tom.android_mvp.model.WeatherModle;
import com.example.tom.android_mvp.view.MainView;

/**
 * Created by tom on 2016/3/25.
 */
public class MainPresenter implements IPresenterToView<MainView>,IPresenterToModle<WeatherBean> {
    private MainView mainView;
    private WeatherModle weatherModle;

    public MainPresenter(MainView view){
        attachview(view);
        weatherModle=new WeatherModle(this);
    }
    public void loadData(){
        mainView.showProgress();
        weatherModle.loadData();
    }

    @Override
    public void loadDataSuccess(WeatherBean data) {
        mainView.showData(data);
        mainView.hideProgress();
    }

    @Override
    public void loadDataFailure() {
        mainView.hideProgress();
    }

    @Override
    public void attachview(MainView view) {
        this.mainView=view;
    }

    @Override
    public void detacview() {
        this.mainView=null;
    }
}

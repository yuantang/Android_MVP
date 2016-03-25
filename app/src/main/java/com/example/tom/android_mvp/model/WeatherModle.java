package com.example.tom.android_mvp.model;

import android.util.Log;

import com.example.tom.android_mvp.presenter.IPresenterToModle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by tom on 2016/3/25.
 * 数据持久层
 */
public class WeatherModle {

    private IPresenterToModle iMainPresenter;
    public WeatherModle(){

    }
    public WeatherModle(IPresenterToModle iMainPresenter){
        this.iMainPresenter=iMainPresenter;
    }
    public  void loadData(){
        ClientService service=AppCliet.createService(ClientService.class);
        Call<WeatherBean> call=service.getWeather();
        call.enqueue(new Callback<WeatherBean>() {
            @Override
            public void onResponse(Response<WeatherBean> response) {
                Log.e("response",response.body().getWeatherinfo().toString());
                iMainPresenter.loadDataSuccess(response.body());
            }
            @Override
            public void onFailure(Throwable t) {
                Log.e("response",t.getMessage());
                iMainPresenter.loadDataFailure();
            }
        });
    }
}

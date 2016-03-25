package com.example.tom.android_mvp.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.tom.android_mvp.R;
import com.example.tom.android_mvp.model.WeatherBean;
import com.example.tom.android_mvp.presenter.MainPresenter;
import com.example.tom.android_mvp.view.MainView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends Activity implements MainView {

    MainPresenter mainPresenter;
    @Bind(R.id.weatherinfo_txt)
    TextView weatherinfoTxt;
    @Bind(R.id.progressBar)
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        mainPresenter=new MainPresenter(this);
        mainPresenter.loadData();
    }

    @Override
    public void showData(WeatherBean weatherInfo) {
        weatherinfoTxt.setText(weatherInfo.getWeatherinfo().toString());
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
    }
    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
    }
}

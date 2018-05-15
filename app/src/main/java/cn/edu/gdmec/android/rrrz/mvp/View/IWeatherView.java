package cn.edu.gdmec.android.rrrz.mvp.View;

import cn.edu.gdmec.android.rrrz.WeatherBean;

/**
 * Created by apple on 18/5/15.
 */

public interface IWeatherView {
    void showWeatherData(WeatherBean weatherBean);

    void hideProgress();

    void showProgress();

    void showLoadFailMsg(Exception e);
}

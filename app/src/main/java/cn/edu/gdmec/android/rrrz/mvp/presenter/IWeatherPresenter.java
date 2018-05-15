package cn.edu.gdmec.android.rrrz.mvp.presenter;

import cn.edu.gdmec.android.rrrz.mvp.model.ILoadListener;

/**
 * Created by apple on 18/5/15.
 */

public interface IWeatherPresenter {
    void loadWeather(String city);
}

package cn.edu.gdmec.android.rrrz.mvp.model;

import cn.edu.gdmec.android.rrrz.WeatherBean;

/**
 * Created by apple on 18/5/15.
 */

public interface ILoadListener {
    void onSuccess(WeatherBean bean);
    void onFailure(Exception e);
}

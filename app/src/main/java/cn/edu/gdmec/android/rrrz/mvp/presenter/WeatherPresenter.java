package cn.edu.gdmec.android.rrrz.mvp.presenter;

import cn.edu.gdmec.android.rrrz.WeatherBean;
import cn.edu.gdmec.android.rrrz.mvp.View.IWeatherView;
import cn.edu.gdmec.android.rrrz.mvp.model.ILoadListener;
import cn.edu.gdmec.android.rrrz.mvp.model.IWeatherModel;
import cn.edu.gdmec.android.rrrz.mvp.model.WeatherModel;

/**
 * Created by apple on 18/5/15.
 */

public class WeatherPresenter implements IWeatherPresenter,ILoadListener{
    private String url="https://www.sojson.com/open/api/weather/json.shtml?city=";
    private IWeatherView iWeatherView;
    private IWeatherModel iWeatherModel;

    public  WeatherPresenter(IWeatherView iWeatherView){
        this.iWeatherView = iWeatherView;
        this.iWeatherModel = new WeatherModel();
    }
    @Override
    public void onSuccess(WeatherBean bean) {
        iWeatherView.hideProgress();
        iWeatherView.showWeatherData(bean);
    }

    @Override
    public void onFailure(Exception e) {
        iWeatherView.hideProgress();
        iWeatherView.showLoadFailMsg(e);
    }

    @Override
    public void loadWeather(String city) {
        iWeatherView.showProgress();
        iWeatherModel.loadWeather(url+city,this);
    }
}

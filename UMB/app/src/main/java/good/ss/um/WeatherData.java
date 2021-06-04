package good.ss.um;

import org.json.JSONException;
import org.json.JSONObject;

public class WeatherData {
    private String mTemperature,mIcon,mCity,mWeatherType;
    private int mCondition;

    public static WeatherData fromJson(JSONObject jsonObject){
        try{
            WeatherData weatherD=new WeatherData();
            weatherD.mCity=jsonObject.getString("name");
            weatherD.mCondition=jsonObject.getJSONArray("weather").getJSONObject(0).getInt("id");
            weatherD.mWeatherType=jsonObject.getJSONArray("weather").getJSONObject(0).getString("main");
            weatherD.mIcon=updateWeatherIcon(weatherD.mCondition);
            double tempResult=jsonObject.getJSONObject("main").getDouble("temp")-273.75;
            int roundedValue=(int)Math.rint(tempResult);
            weatherD.mTemperature=Integer.toString(roundedValue);
            return weatherD;
        }
        catch(JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    private static String updateWeatherIcon(int condition){
        if(condition>=0 && condition<=300)
        {
            return "thunderstorm1";
        }
        else if(condition>=300 && condition<=500)
        {
            return "lightrain";
        }
        else if(condition>=500 && condition<=600)
        {
            return "shower";
        }
        else if(condition>=600 && condition<=700)
        {
            return "snow2";
        }
        else if(condition>=701 && condition<=771)
        {
            return "fog";
        }
        else if(condition>=772 && condition<=800)
        {
            return "overcast";
        }
        else if(condition==800)
        {
            return "sunny";
        }
        else if(condition>=801 && condition <=904 )
        {
            return "cloudy";
        }
        else if(condition==903  )
        {
            return "snow1";
        }
        else if(condition==903  )
        {
            return "sunny";
        }
        if(condition>=905 && condition <=1000){
            return "thunderstorm2";
        }
        return "dunno";

    }

    public String getmTemperature(){
        return mTemperature+"°C";
    }

    public String getmIcon(){
        return mIcon;
    }

    public String getmCity(){
        return mCity;
    }

    public String getmWeatherType(){
        return mWeatherType;
    }
}
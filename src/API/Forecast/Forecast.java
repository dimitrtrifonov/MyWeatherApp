package API.Forecast;

import com.google.gson.annotations.SerializedName;



public class Forecast {
    
    @SerializedName("txt_forecast")
    public TxtForecast txtForecast;

    @SerializedName("simpleforecast")
    public SimpleForecast simpleForecast;
    
    
}
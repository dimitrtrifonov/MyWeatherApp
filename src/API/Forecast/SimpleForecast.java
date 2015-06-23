package API.Forecast;

import com.google.gson.annotations.SerializedName;

public class SimpleForecast {
    
    @SerializedName("forecastday")
    public SimpleForecastForecastDay forecastDay[];
}

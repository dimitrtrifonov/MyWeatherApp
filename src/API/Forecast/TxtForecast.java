package API.Forecast;

import com.google.gson.annotations.SerializedName;

public class TxtForecast {
	
    @SerializedName("date")
    public String date;
    
    @SerializedName("forecastday")
    public TxtForecastForecastDay forecastDay[];
    

    
}

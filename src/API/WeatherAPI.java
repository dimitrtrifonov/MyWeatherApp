package API;

import com.google.gson.annotations.SerializedName;

import API.CurrentObservation.CurrentObservation;
import API.Forecast.Forecast;
import API.Response.Response;

public class WeatherAPI {
    @SerializedName("response")
    public Response response;
     
    @SerializedName("current_observation" )
    public CurrentObservation currentObservation;
    
    @SerializedName("forecast" )
    public Forecast forecast;
}

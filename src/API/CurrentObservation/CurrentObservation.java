package API.CurrentObservation;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.annotations.SerializedName;

public class CurrentObservation {

    @SerializedName("image")
    public Image image;
	
    @SerializedName("display_location")
    public DisplayLocation displayLocation;    

    @SerializedName("observation_location")
    public ObservationLocation observationLocation;    
    
    @SerializedName("station_id")
    public String stationId;

    @SerializedName("observation_time")
    public String observationTime;    

    @SerializedName("observation_time_rfc822")
    public String observationTimeRfc822;     

    @SerializedName("observation_epoch")
    public String observationEpoch; 
 
    @SerializedName("local_time_rfc822")
    public String localTimeRfc822; 
 
    @SerializedName("local_epoch")
    public String localEpoch;    
 
    @SerializedName("local_tz_short")
    public String localTzShort;  

    @SerializedName("local_tz_long")
    public String localTzLong;      
  
    @SerializedName("local_tz_offset")
    public String localTzOffset; 

    @SerializedName("weather")
    public String weather;     

    @SerializedName("temperature_string")
    public String temperatureString;    
    
    @SerializedName("temp_f")
    public String tempF;    
    
    @SerializedName("temp_c")
    public String tempC;    
    
    @SerializedName("relative_humidity")
    public String relativeHumidity;    
    
    @SerializedName("wind_string")
    public String windString;    
    
    @SerializedName("wind_dir")
    public String windDir;    
    
    @SerializedName("wind_degrees")
    public String windDegrees;    
    
    @SerializedName("wind_mph")
    public String windMph;  
    
    @SerializedName("wind_gust_mph")
    public String windGustMph;  
    
    @SerializedName("wind_kph")
    public String windKph;  
    
    @SerializedName("wind_gust_kph")
    public String windGustKph;  
    
    @SerializedName("pressure_mb")
    public String pressureMb;  
    
    @SerializedName("pressure_in")
    public String pressureIn;  
    
    @SerializedName("pressure_trend")
    public String pressureTrend;  
    
    @SerializedName("dewpoint_string")
    public String dewpoint_string;  
    
    @SerializedName("dewpoint_f")
    public String dewpointF;  
    
    @SerializedName("dewpoint_c")
    public String dewpointC;  
    
    @SerializedName("heat_index_string")
    public String heatIndexString;  
    
    @SerializedName("windchill_string")
    public String windchillString;  
    
    @SerializedName("heat_index_f")
    public String heatIndexF;  

    @SerializedName("heat_index_c")
    public String heatIndexC;  
    
    @SerializedName("feelslike_string")
    public String feelslikeString;  
    
    @SerializedName("feelslike_f")
    public String feelslikeF;  
    
    @SerializedName("feelslike_c")
    public String feelslikeC;  
    
    @SerializedName("visibility_mi")
    public String visibilityMi;  
    
    @SerializedName("visibility_km")
    public String visibilityKm;  
    
    @SerializedName("solarradiation")
    public String solarradiation;  

    @SerializedName("precip_1hr_string")
    public String precip1hrString; 

    @SerializedName("precip_1hr_in")
    public String precip1hrIn; 
    
    @SerializedName("precip_1hr_metric")
    public String precip1hrMetric; 
    
    @SerializedName("precip_today_string")
    public String precipTodayString; 
    
    @SerializedName("precip_today_in")
    public String precipTodayIn; 
    
    @SerializedName("precip_today_metric")
    public String precipTodayMetric; 
    
    @SerializedName("icon")
    public String icon; 
    
    @SerializedName("icon_url")
    public String iconUrl; 
    
    @SerializedName("forecast_url")
    public String forecast_url; 
    
    @SerializedName("history_url")
    public String historyUrl; 
    
    @SerializedName("ob_url")
    public String obUrl; 
       
}

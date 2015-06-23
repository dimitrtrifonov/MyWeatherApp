package API.Forecast;

import com.google.gson.annotations.SerializedName;

public class SimpleForecastForecastDay {
	  
    @SerializedName("date")
    public Date date;
 
    @SerializedName("high")
    public High high;
    
    @SerializedName("low")
    public Low low;
   
    @SerializedName("conditions")
    public String conditions;
  
    @SerializedName("avewind")
    public AverageWind averageWind;    
    
    @SerializedName("avehumidity")
    public String averageHumidity;
    
}

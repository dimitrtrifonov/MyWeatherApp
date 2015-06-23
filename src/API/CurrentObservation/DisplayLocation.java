package API.CurrentObservation;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.annotations.SerializedName;

public class DisplayLocation{
	
    @SerializedName("full")
    public String full;
    
    @SerializedName("city")
    public String city;
    
    @SerializedName("state")
    public String state;
 
    @SerializedName("state_name")
    public String stateName;    
    
    @SerializedName("country")
    public String country;
    
    @SerializedName("country_iso3166")
    public String countryIso3166;
    
    @SerializedName("zip")
    public String zip;    
    
    @SerializedName("magic")
    public String magic;    
  
    @SerializedName("wmo")
    public String wmo;        
    
    @SerializedName("latitude")
    public String latitude;
 
    @SerializedName("longitude")
    public String longitude;
   
    @SerializedName("elevation")
    public String elevation; 	
}

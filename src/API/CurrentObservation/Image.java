package API.CurrentObservation;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.annotations.SerializedName;

public class Image extends CurrentObservation {

    @SerializedName("url")
    public String url;

    @SerializedName("title")
    public String title;
    
    @SerializedName("link")
    public String link;
   
	
}

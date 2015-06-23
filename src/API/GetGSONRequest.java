package API;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.util.Log;

import com.google.gson.Gson;

public class GetGSONRequest {
	
	WeatherAPI weatherAPI;
	
	public GetGSONRequest(String url){
		InputStream source = retrieveStream(url);
		if(source!=null){
	        Gson gson = new Gson();
	        Reader reader = new InputStreamReader(source);
	        weatherAPI = gson.fromJson(reader, WeatherAPI.class);
		}
	}
	private InputStream retrieveStream(String url) {
		
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet(url);
        
        try {
           HttpResponse getResponse = client.execute(getRequest);
           final int statusCode = getResponse.getStatusLine().getStatusCode();
           if (statusCode != HttpStatus.SC_OK) {
              Log.w(getClass().getSimpleName(),"Error " + statusCode + " for URL " + url);
              return null;
           }
           HttpEntity getResponseEntity = getResponse.getEntity();
           return getResponseEntity.getContent();
        }
        catch (IOException e) {
           getRequest.abort();
           Log.w(getClass().getSimpleName(), "Error for URL " + url, e);
        }
        
        return null;
	}
	
	public WeatherAPI getWeatherAPI(){
		return weatherAPI;
	}
}
	


package com.example.simpleweather;

import API.GetGSONRequest;
//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class WeatherInfoFragment extends Fragment {
	private TextView mLocationNameTextView;
	private TextView mDateStringTextView;
	private TextView mTemperatureStringTextView;
	private TextView mFeelslikeStringTextView;
	private TextView mWindStringTextView;
	private TextView mRelativeHumidityTextView;
	
	private String mLocationName;
	private String mDateString;
	private String mTemperatureString;
	private String mFeelslikeString;		
	private String mWindString;
	private String mRelativeHumidity;
	
	private String mDayNumber;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	
		View rootView = inflater.inflate(R.layout.fragment_weather_info,container, false);
			
		new ForecastAsyncTask().execute();
		
		return rootView;
	}	
	
	private class ForecastAsyncTask extends AsyncTask<String,String,String>{
		GetGSONRequest getGSONRequest;
		String weatherAppInfo="";
		String weatherAppInfoBase="http://api.wunderground.com/api/fedfc56ec42b0d70/conditions/forecast10day/q/";
		
		@Override
		protected String doInBackground(String... params) {
			// TODO Auto-generated method stub
			//Bundle ABundle=getActivity().getIntent().getExtras();
			
			mLocationName=getArguments().getString("locationName");
			mDayNumber=getArguments().getString("dayNumber");
			
			if(mLocationName.equals("Paris")){	
				weatherAppInfo=weatherAppInfoBase.concat("France/Paris.json");
			}

			if(mLocationName.equals("Brussels")){	
				weatherAppInfo=weatherAppInfoBase.concat("Belgium/Brussels.json");
			}
			
			if(mLocationName.equals("London")){	
				weatherAppInfo=weatherAppInfoBase.concat("England/London.json");
			}		
			if(!mLocationName.equals(""))getGSONRequest=new GetGSONRequest(weatherAppInfo);
			else Log.v(mLocationName, " mLocationName  is NULL");
			
			retrieveWeatherAPIData();
			return null;
		}
		@Override
		protected void onPostExecute(String result) {
			setWeatherAPIDataToTextViews();
		}
		
		private boolean isObjectNull(Object object){
			if(object==null){
				Toast.makeText(getActivity(), "Cannot retrieve information: object does not exist", Toast.LENGTH_LONG).show();
				return true;
			}
			return false;
		}
		
		private void retrieveWeatherAPIData(){
			if(isObjectNull(getGSONRequest.getWeatherAPI()))return;
			if(isObjectNull(getGSONRequest.getWeatherAPI().currentObservation))return;
			
			int s=Integer.parseInt(mDayNumber);
			
			mDateString=getGSONRequest.getWeatherAPI().forecast.simpleForecast.forecastDay[s].date.pretty;
			String lowCelsius=getGSONRequest.getWeatherAPI().forecast.simpleForecast.forecastDay[s].low.celsius;
			String highCelsius=getGSONRequest.getWeatherAPI().forecast.simpleForecast.forecastDay[s].high.celsius;	
			mTemperatureString=lowCelsius+" - "+highCelsius;
				
			mFeelslikeString=getGSONRequest.getWeatherAPI().forecast.simpleForecast.forecastDay[s].conditions;
			mWindString=getGSONRequest.getWeatherAPI().forecast.simpleForecast.forecastDay[s].averageWind.kph;
			mRelativeHumidity=getGSONRequest.getWeatherAPI().forecast.simpleForecast.forecastDay[s].averageHumidity;
		}	
		
		private void setWeatherAPIDataToTextViews(){
			
			mLocationNameTextView=(TextView) getView().findViewById(R.id.location);
			mLocationNameTextView.setText("Location: "+mLocationName);
			
			mDateStringTextView=(TextView) getView().findViewById(R.id.date);
			mDateStringTextView.setText("Date: "+mDayNumber);
			
			mTemperatureStringTextView=(TextView) getView().findViewById(R.id.temperature_string);
			mTemperatureStringTextView.setText("Temperature: "+mTemperatureString);
			
			mFeelslikeStringTextView=(TextView) getView().findViewById(R.id.feelslike_string);
			mFeelslikeStringTextView.setText("Feels Like: "+mFeelslikeString);
			
			mWindStringTextView=(TextView) getView().findViewById(R.id.wind_string);
			mWindStringTextView.setText("Wind: "+mWindString);			
			
			mRelativeHumidityTextView=(TextView) getView().findViewById(R.id.relative_humidity);
			mRelativeHumidityTextView.setText("Relative Humidity: "+mRelativeHumidity);
		
		}
	}
}

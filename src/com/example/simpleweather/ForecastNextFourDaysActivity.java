package com.example.simpleweather;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class ForecastNextFourDaysActivity extends ActionBarActivity {
	
	ViewPager viewPager;
	String locationName;
	
	private List<Fragment> getFragments(){
		List<Fragment> list = new ArrayList<Fragment>();
		for(int a=1;a<5;a++){
			list.add(newWeatherInfoFragment(locationName,String.valueOf(a)));	
		}
		return list;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forecast_next_four_days);
		
		Bundle extras = getIntent().getExtras();
		locationName=extras.getString("locationName");
		
		viewPager = (ViewPager) findViewById(R.id.view_pager);
		ControllerFragment controllerFragment= new ControllerFragment(getSupportFragmentManager(),getFragments());
		viewPager.setAdapter(controllerFragment);
	}
	
	public WeatherInfoFragment newWeatherInfoFragment(String locationName,String dayNumber){
		
		WeatherInfoFragment weatherInfoFragment = new WeatherInfoFragment();	
		Bundle bundle = new Bundle();
		bundle.putString("dayNumber",dayNumber);
		bundle.putString("locationName",locationName);
		weatherInfoFragment.setArguments(bundle);
		return weatherInfoFragment;
	}
}

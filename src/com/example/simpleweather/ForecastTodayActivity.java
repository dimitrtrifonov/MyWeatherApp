package com.example.simpleweather;

/*
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
*/

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ForecastTodayActivity extends ActionBarActivity {
	
	String mLocationName;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_forecast_today);

		mLocationName=this.getIntent().getExtras().getString("locationName");
		
		AddWeatherInfoFragment();
		
		Button nextFourDaysButton = (Button) findViewById(R.id.nextFourDays);
		OnClickListener onClickListener = new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Bundle bundle = new Bundle();
				bundle.putString("locationName",mLocationName);

				Intent mIntent = new Intent(getApplicationContext(),ForecastNextFourDaysActivity.class);
				mIntent.putExtras(bundle);
				startActivity(mIntent);
			}
		};
		nextFourDaysButton.setOnClickListener(onClickListener);
	}
	
	private void AddWeatherInfoFragment(){
		Fragment weatherInfoFragment = WeatherInfoFragment.instantiate(this, WeatherInfoFragment.class.getName());

		Bundle bundle=new Bundle();
		bundle.putString("locationName", mLocationName);
		bundle.putString("dayNumber", "0");
		weatherInfoFragment.setArguments(bundle);
		
		FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.first_layout,weatherInfoFragment);
        fragmentTransaction.commit();
	}

}

package com.example.simpleweather;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		Button parisButton = (Button) findViewById(R.id.button_paris);
		OnClickListener parisOnClickListener = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				callForecastActivity("Paris");
			}
		};
		parisButton.setOnClickListener(parisOnClickListener);

		Button brusselsButton = (Button) findViewById(R.id.button_brussels);
		OnClickListener brusselsOnClickListener = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				callForecastActivity("Brussels");
			}
		};
		brusselsButton.setOnClickListener(brusselsOnClickListener);	

		Button londonButton = (Button) findViewById(R.id.button_london);
		OnClickListener londonOnClickListener = new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				callForecastActivity("London");
			}
		};
		londonButton.setOnClickListener(londonOnClickListener);			
		
	}

	private void callForecastActivity(String locationName){
		Bundle bundle= new Bundle();
		bundle.putString("locationName", locationName);
		Intent mIntent= new Intent(this,ForecastTodayActivity.class);
		mIntent.putExtras(bundle);
		startActivity(mIntent);
	}
}

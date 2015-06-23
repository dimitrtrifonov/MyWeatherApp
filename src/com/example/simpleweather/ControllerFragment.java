package com.example.simpleweather;

import java.util.List;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ControllerFragment extends FragmentPagerAdapter {
	
	List <Fragment> fragments;
	Context context;
	
	public ControllerFragment(FragmentManager fragmentManager,List <Fragment> fragments){
		super(fragmentManager);
		this.fragments=fragments;
		Log.w("ControllerFragment AAA ", String.valueOf(fragments.size()));
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		return fragments.get(position);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fragments.size();
	}
	
}

package com.cla.mycollection;


import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
/*
 * @author Clare
 * This is the main container for Tabs Activity
 */
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabsActivity extends TabActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab);
		//Instantiate class TabHost
		TabHost tabHost =  getTabHost();
		Resources resources = getResources();
		
		Intent homeActivity = new Intent().setClass(getApplicationContext(), HomeActivity.class);
		TabSpec hometabSpec = tabHost.newTabSpec("Home").setIndicator("Home",resources.getDrawable(R.drawable.ic_launcher))
				.setContent(homeActivity);
		
		Intent contactsActivity = new Intent().setClass(getApplicationContext(), ContactActivity.class);
		TabSpec contactstabSpec = tabHost.newTabSpec("Contact Us").setIndicator("Contact",resources.getDrawable(R.drawable.ic_launcher))
				.setContent(contactsActivity);
		
		Intent aboutActivity = new Intent().setClass(getApplicationContext(), AboutActivity.class);
		TabSpec abouttabSpec = tabHost.newTabSpec("About Us").setIndicator("About",resources.getDrawable(R.drawable.ic_launcher))
				.setContent(aboutActivity);
		//tab the Tabs
		
		tabHost.addTab(hometabSpec);
		tabHost.addTab(abouttabSpec);
		tabHost.addTab(contactstabSpec);
	}

	
}

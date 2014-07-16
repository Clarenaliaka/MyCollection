package com.cla.mycollection;


import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {

		// Declaration of Variables
		private ListView listView;
		private ArrayAdapter<String> stringArrayAdapter;
		String[] planets = { "Mercury", "Earth", "Venus", "Neptune", "Mars",
		"Pluto", "Sartun", "Jupiter" };

		@Override
		protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Initialization
		listView = (ListView) findViewById(R.id.planets);
		ArrayList<String> planetList = new ArrayList<String>();
		planetList.addAll(Arrays.asList(planets));

		// Design the ListView
		stringArrayAdapter = new ArrayAdapter<String>(this,
		R.layout.simple_layout, planetList);
		listView.setAdapter(stringArrayAdapter);
		listView.setOnItemClickListener(this);

		}

		public void onItemClick1(AdapterView<?> arg0, View view, int position,
		long arg3) {

		String listData = listView.getItemAtPosition(position).toString();
		Toast.makeText(getApplicationContext(), listData + " : " + position, Toast.LENGTH_SHORT)
		.show();

		}

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// TODO Auto-generated method stub
			
		}

		

	}




package com.cla.mycollection;


import java.util.ArrayList;
import java.util.List;

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class CountryScreenActivity extends Activity implements OnItemSelectedListener {
        Spinner country;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.country);
		//Spinner element
		country=(Spinner) findViewById(R.id.country);
		//Spinner on click
		country.setOnItemSelectedListener(this);
		//This are my spinner drop down elements
		List<String> list = new ArrayList<String>();
		list.add("Kenya");
		list.add("Uganda");
        list.add("Tanzania");
        list.add("Somalia");
        list.add("Sudan");
        list.add("Nigeria");
        list.add("Algeria");
        list.add("Brazil");
        list.add("Germany");
        list.add("Argentina");
        list.add("Ethiopia");
        //design
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		//attaching data adapter to spinners
		country.setAdapter(dataAdapter);
		
		
		
		
	}
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
	//on selecting a spinner item
		String item = parent.getItemAtPosition(position).toString();
		Toast.makeText(CountryScreenActivity.this, "country : "+ String.valueOf(country.getSelectedItem()), Toast.LENGTH_LONG).show();
		 
        
	}
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
	
		
	}
}

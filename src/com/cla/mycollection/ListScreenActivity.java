package com.cla.mycollection;


import java.util.ArrayList;
import java.util.Arrays;

import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListScreenActivity extends Activity implements OnItemClickListener {


	//Declaration
	private ListView listview;
	private android.widget.ArrayAdapter<String> stringArrayAdapter;
	String[] lists ={"Addition","Subtraction","Login Form","Increment","Decrement","Button Toast","Countries","Tabs"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		
		//Initialization
	
		listview = (ListView) findViewById(R.id.list);
		ArrayList<String> List = new ArrayList<String>();
		List.addAll(Arrays.asList(lists));
		//Design the ListView
		stringArrayAdapter = new ArrayAdapter<String>(this,R.layout.simple_layout, List);
        listview.setAdapter(stringArrayAdapter);
        listview.setOnItemClickListener(this);
	}
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		String ListData = listview.getItemAtPosition(position).toString();
		switch (position) {
		case 0:
			startActivity(new Intent(getApplicationContext(),AdditionScreenActivity.class));
			break;
			
		case 1:
			startActivity(new Intent(getApplicationContext(),AdditionScreenActivity.class));
			break;
			
		case 2:
			startActivity(new Intent(getApplicationContext(),LoginScreenActivity.class));
	         break;
	         
	     case 3:
	    	 startActivity(new Intent(getApplicationContext(),IncrementScreenActivity.class));
	        break;

         case 4:
        	 startActivity(new Intent(getApplicationContext(),IncrementScreenActivity.class));
	        break;

           case 5:
        	startActivity(new Intent(getApplicationContext(),ToastScreenActivity.class));
	       break;

            case 6:
            	startActivity(new Intent(getApplicationContext(),CountryScreenActivity.class));
	        break;
	        
            case 7:
            	startActivity(new Intent(getApplicationContext(),TabsActivity.class));
	        break;

		default:
			break;
		}
		
		
	}
	
}
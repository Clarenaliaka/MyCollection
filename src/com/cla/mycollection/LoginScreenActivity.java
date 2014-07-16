package com.cla.mycollection;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;



public class LoginScreenActivity extends Activity implements OnClickListener {

EditText etname,etpassword;
CheckBox chkpassword;
Button btntoast,btnback;
String strusername,strpassword;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		//calling the checkbox and creating a method
	
		
		//initialization
		 etname = (EditText) findViewById(R.id.etname);
	     strusername = etname.getText().toString();
	    
		etpassword = (EditText) findViewById(R.id.etpassword);
		strpassword = etpassword.getText().toString();
	    
		btntoast = (Button) findViewById(R.id.btntoast);
		btntoast.setOnClickListener(this);
		
		btnback = (Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(this);
		
		chkpassword = (CheckBox) findViewById(R.id.chkpassword);
		
        // when user clicks on this checkbox, this is the handler.
		
		chkpassword.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// checkbox status is changed from uncheck to checked.
				if (!isChecked) {
					//show the password
					etpassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
					
				} else {
					//hide the password
					etpassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());

				}
				
			}
		});
	}
	@Override
	public void onClick(View v) {
		// we will intent using the switch case
		switch (v.getId()) {
		case R.id.btntoast:
			startActivity(new Intent(getApplicationContext(),ToastScreenActivity.class));
			
			break;

		case R.id.btnback:
			startActivity(new Intent(getApplicationContext(),ListScreenActivity.class));
			
			break;
			
		default:
			break;
		}
		
	}
	
	}



package com.cla.mycollection;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ToastScreenActivity extends Activity implements OnClickListener {

	Button btntoast;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.toast);
		//initialization
		btntoast = (Button) findViewById(R.id.btntoast1);
		btntoast.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btntoast1:
			Toast.makeText(ToastScreenActivity.this, "rudi home", Toast.LENGTH_SHORT).show();
			startActivity(new Intent(getApplicationContext(),ListScreenActivity.class));
			
			break;

		default:
			break;
		}
		
	}

	
}

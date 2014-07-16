package com.cla.mycollection;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class IncrementScreenActivity extends Activity implements OnClickListener {
	EditText etname;
	TextView tvresults;
	Button btnincre,btndecre;
	String strname;
	int number;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.increment);
		//initialization
		btnincre = (Button) findViewById(R.id.btnincre);
		btnincre.setOnClickListener(this);
		
		btndecre = (Button) findViewById(R.id.btndecre);
		btndecre.setOnClickListener(this);
		
		etname = (EditText) findViewById(R.id.etname);
		tvresults = (TextView) findViewById(R.id.tvincreresults);
		
	}

	@Override
	public void onClick(View v) {
		String showText ="false";
		Intent intent = new Intent(this,IncrementScreenActivity.class);
		strname=etname.getText().toString();
		
		//strname = Integer.parseInt(strname);
				switch (v.getId()) {
				case R.id.btnincre:
					number++; showText="true";
					break;
                case R.id.btndecre:
                	number--; showText="true";
					break;

				default:
					break;}
				if (showText != null) {
					tvresults.setText("results:" +number);
					
				}
				}
	

	
}

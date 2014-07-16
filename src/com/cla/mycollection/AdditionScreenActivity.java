				package com.cla.mycollection;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class AdditionScreenActivity extends Activity implements OnClickListener {
	EditText etnumber1,etnumber2;
	TextView tvresults;
	Button btnadd,btnsub,btnback;
	String strnumber1,strnumber2;
	int number1, number2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addition);
		//initialize
		etnumber1 = (EditText) findViewById(R.id.etnumber1);
		etnumber2 = (EditText) findViewById(R.id.etnumber2);
		tvresults = (TextView) findViewById(R.id.tvresults);
		
		btnadd = (Button) findViewById(R.id.btnadd);
		btnadd.setOnClickListener(this);
		
		btnsub = (Button) findViewById(R.id.btnsub);
		btnsub.setOnClickListener(this);
		
		btnback = (Button) findViewById(R.id.btnback);
		btnback.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnadd:
			//integer to string
			strnumber1=etnumber1.getText().toString();
			strnumber2=etnumber2.getText().toString();
			
			//converting String to interger
			number1=Integer.parseInt(strnumber1);
			number2=Integer.parseInt(strnumber2);
			
			int answer=addition(number1,number2);
			String Result = String.valueOf(answer);
			tvresults.setText(Result);
			break;
			
        case R.id.btnsub:
        	int ans=subtraction(number1,number2);
			String result= String.valueOf(ans);
			tvresults.setText(result);
			break;
			
        case R.id.btnback:
        	Toast.makeText(AdditionScreenActivity.this, "Twende Home",Toast.LENGTH_SHORT).show();
        	startActivity(new Intent(getApplicationContext(),ListScreenActivity.class));
        	break;


		default:
			break;
		}
		
	}


	private int addition(int number1, int number2) {
		int answer =number1+number2;
		return answer;
	}
	private int subtraction(int number1, int number2) {
		int answer =number1-number2;
		return answer;
	}
}

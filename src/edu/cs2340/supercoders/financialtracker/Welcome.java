package edu.cs2340.supercoders.financialtracker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Welcome extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		
		LoginData.initializeRegistry();
		
		//Setting up the login button
		Button login = (Button) findViewById(R.id.welcome_login_button);
		login.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v){
				Intent loginIntent = new Intent(getApplicationContext(), Login.class);
				startActivity(loginIntent);
			}
		});
		
		Button register = (Button) findViewById(R.id.welcome_register_button);
		register.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v){
				Intent registerIntent = new Intent(getApplicationContext(), Register.class);
				startActivity(registerIntent);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

}

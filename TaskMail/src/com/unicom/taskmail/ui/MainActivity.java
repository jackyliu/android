package com.unicom.taskmail.ui;

import com.unicom.taskmail.R;
import com.unicom.taskmail.R.id;
import com.unicom.taskmail.R.layout;
import com.unicom.taskmail.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private static final String TAG = "taskmail";
	private Button mGotoLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mGotoLogin = (Button)this.findViewById(R.id.button1);
		mGotoLogin.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()) {
		case R.id.button1:
			Log.d(TAG, "go to login");
			Intent intent = new Intent();
			intent.setClass(this.getApplicationContext(), LoginActivity.class);
			this.startActivity(intent);
			break;
		}
		
	}
	

}

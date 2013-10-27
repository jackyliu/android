package com.unicom.taskmail.ui;

import net.tsz.afinal.FinalDb;

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
	private Button mAfinal;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mGotoLogin = (Button)this.findViewById(R.id.button1);
		mAfinal = (Button)this.findViewById(R.id.afinal);
		mGotoLogin.setOnClickListener(this);
		mAfinal.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public class User {
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		private String name;
		private String email;
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
		case R.id.afinal:
			Log.d(TAG, "afinal tets");
			FinalDb db = FinalDb.create(this);
			User u= new User();
			u.setEmail("jacky@mail.com");
			u.setName("name");
			db.save(u);
			break;
		}
		
	}
	

}

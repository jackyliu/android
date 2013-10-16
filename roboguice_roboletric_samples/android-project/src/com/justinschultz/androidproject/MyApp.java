package com.justinschultz.androidproject;

import android.app.Application;
import android.util.Log;

public class MyApp extends Application {

	private static final String TAG = "app";

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		Log.d(TAG, "MyApp onCreate");
	}

	@Override
	public void onLowMemory() {
		// TODO Auto-generated method stub
		super.onLowMemory();
	}

	@Override
	public void onTerminate() {
		// TODO Auto-generated method stub
		super.onTerminate();
	}

	public MyApp() {
		// TODO Auto-generated constructor stub
	}

}

package com.justinschultz.androidproject;

//import android.app.Activity;
//import roboguice.activity.RoboActivity;
//import roboguice.activity.RoboActivity;
//import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
//import android.widget.TextView;

import com.justinschultz.androidproject.R;


//@ContentView(R.layout.main)
//public class MainActivity extends RoboActivity {
public class MainActivity extends Activity {
    private static final String TAG = "app";
	/** Called when the activity is first created. */
	@InjectView(R.id.button1) Button ok;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.main);
        Log.d(TAG, (String) ok.toString());
        if(ok == null) {
        	Log.d(TAG, "null");
        } else {
        	Log.d(TAG, "ok");
        }
    }
}
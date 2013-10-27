package com.unicom.taskmail.ui;

import com.unicom.taskmail.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LoginActivity extends Activity {

	private String[] mPlantTitles = new String[] {"aaa", "bbb", "ccc"};
	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.home_screen);
		this.mDrawerLayout = (DrawerLayout) this.findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) this.findViewById(R.id.left_drawer);
		mDrawerList.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, this.mPlantTitles));
		
//		this.mDrawerLayout.setDrawerShadow(R.drawable.dr, gravity);
//		mDrawerList.setAdapter(new ArrayAdapter<String>());
//		this.setContentView(layoutResID);
	}
}

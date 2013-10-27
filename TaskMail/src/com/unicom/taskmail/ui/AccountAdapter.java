package com.unicom.taskmail.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AccountAdapter extends ArrayAdapter<MailAccount> {

	public AccountAdapter(Context context, int resource) {
		super(context, resource);
		// TODO Auto-generated constructor stub
	}
	private class HolderView {
		public TextView mText1;
		public TextView mText2;
		
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		if(convertView == null) { // need create new view
			
		} else {
			
		}
		return super.getView(position, convertView, parent);
	}
}

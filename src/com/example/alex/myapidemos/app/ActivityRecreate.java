package com.example.alex.myapidemos.app;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class ActivityRecreate extends BaseActivity {
	
	int mCurTheme;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if (savedInstanceState != null) {
			mCurTheme = savedInstanceState.getInt("theme");
			
			switch (mCurTheme) {
			case android.R.style.Theme_Holo_Light:
				mCurTheme = android.R.style.Theme_Holo_Dialog;
				break;
			case android.R.style.Theme_Holo_Dialog:
				mCurTheme = android.R.style.Theme_Holo;
				break;
			default:
				mCurTheme = android.R.style.Theme_Holo_Light;
				break;
			}
			setTheme(mCurTheme);
		}
		setContentView(R.layout.activity_recreate);
		findViewById(R.id.recreate).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				recreate();
			}
		});
	}
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt("theme",mCurTheme);
	}
}

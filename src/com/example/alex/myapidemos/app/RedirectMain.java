package com.example.alex.myapidemos.app;

import android.R.string;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class RedirectMain extends BaseActivity {
	
	static final int INIT_TEXT_REQUEST = 0;
	static final int NEW_TEXT_REQUEST = 1;
	private String mTextPrefs;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.redirect_main);
		findViewById(R.id.clear).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SharedPreferences sharedPreferences = getSharedPreferences("RedirectData", 0);
				sharedPreferences.edit().remove("text").commit();
				finish();
			}
		});
		
		findViewById(R.id.newView).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(RedirectMain.this, RedirectGetter.class);
				startActivityForResult(intent,NEW_TEXT_REQUEST);
			}
		});
		
		if (!loadPrefs()) {
			Intent intent = new Intent(this, RedirectGetter.class);
			startActivityForResult(intent, INIT_TEXT_REQUEST);
		}
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == INIT_TEXT_REQUEST) {
			if (resultCode == RESULT_CANCELED) {
				finish();
			}else {
				loadPrefs();
			}
		}else if( requestCode == NEW_TEXT_REQUEST){
			if (resultCode != RESULT_CANCELED) {
				loadPrefs();
			}
		}
	}
	
	private final boolean loadPrefs(){
		SharedPreferences sharedPreferences = getSharedPreferences("RedirectData", 0);
		mTextPrefs = sharedPreferences.getString("text", null);
		if (mTextPrefs != null) {
			TextView textView = (TextView) findViewById(R.id.text);
			textView.setText(mTextPrefs);
			return true;
		}
		return false;
	}
}

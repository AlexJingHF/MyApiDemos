package com.example.alex.myapidemos.app;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class RedirectGetter extends BaseActivity {

	private String mTextPref;
	private TextView mText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.redirect_getter);
		findViewById(R.id.apply).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				SharedPreferences preferences = getSharedPreferences("RedirectData", 0);
				SharedPreferences.Editor editor = preferences.edit();
				editor.putString("text", mText.getText().toString());
				if (editor.commit()) {
					setResult(RESULT_OK);
				}
				finish();
			}
		});
		
		mText = (TextView) findViewById(R.id.text);
		
		loadPrefs();
	}
	
	private final void loadPrefs(){
		SharedPreferences sharedPreferences = getSharedPreferences("RedirectData", 0);
		mTextPref = sharedPreferences.getString("text", null);
		if (mTextPref != null) {
			mText.setText(mTextPref);
		}else {
			mText.setText("");
		}
	}
}

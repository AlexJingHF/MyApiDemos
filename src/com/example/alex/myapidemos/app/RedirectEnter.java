package com.example.alex.myapidemos.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class RedirectEnter extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.redirect_enter);
		findViewById(R.id.go).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(RedirectEnter.this, RedirectMain.class);
				startActivity(intent);
			}
		});
	}
}

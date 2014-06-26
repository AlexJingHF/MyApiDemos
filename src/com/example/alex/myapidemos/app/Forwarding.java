package com.example.alex.myapidemos.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.R.id;
import com.example.alex.myapidemos.base.BaseActivity;

public class Forwarding extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.forwarding);
		findViewById(R.id.go).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(Forwarding.this, ForwardTarget.class);
				startActivity(intent);
				finish();
			}
		});
	}
}

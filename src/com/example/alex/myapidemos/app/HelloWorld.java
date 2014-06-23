package com.example.alex.myapidemos.app;

import android.os.Bundle;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;


public class HelloWorld extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hello_world);
	}
}

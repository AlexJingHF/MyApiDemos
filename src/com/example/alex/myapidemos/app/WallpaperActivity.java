package com.example.alex.myapidemos.app;

import android.os.Bundle;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

/**
 * 
 * 显示如何使用透明Activity
 * 
 * @author alex
 *
 */

public class WallpaperActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tanslucent_background);
	}
}

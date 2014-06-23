package com.example.alex.myapidemos.base;

import com.example.alex.myapidemos.tools.LogTool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class BaseActivity extends Activity {
	private static final String TAG = BaseActivity.class.getSimpleName();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		LogTool.d(TAG, "onCreate is invoke");
	}

	@Override
	protected void onStart() {
		LogTool.d(TAG, "onStart is invoke");
		super.onStart();
	}

	@Override
	protected void onRestart() {
		LogTool.d(TAG, "onRestart is invoke");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		LogTool.d(TAG, "onResume is invoke");
		super.onResume();
	}

	@Override
	protected void onPause() {
		LogTool.d(TAG, "onPause is invoke");
		super.onPause();
	}

	@Override
	protected void onStop() {
		LogTool.d(TAG, "onStop is invoke");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		LogTool.d(TAG, "onDestroy is invoke");
		super.onDestroy();
	}

	@Override
	public void onLowMemory() {
		LogTool.d(TAG, "onLowMemory is invoke");
		super.onLowMemory();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		LogTool.d(TAG, "onKeyDown is invoke"+" keyCode:"+keyCode+" KeyEvent.Action:"+event.getAction());
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onContentChanged() {
		LogTool.d(TAG, "onContentChanged is invoke");
		super.onContentChanged();
	}

	@Override
	public void onAttachedToWindow() {
		LogTool.d(TAG, "onAttachedToWindow is invoke");
		super.onAttachedToWindow();
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		LogTool.d(TAG, "onActivityResult is invoke"+" resultCode"+resultCode);
		super.onActivityResult(requestCode, resultCode, data);
	}
	
}

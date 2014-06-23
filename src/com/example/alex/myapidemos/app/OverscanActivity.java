package com.example.alex.myapidemos.app;

import android.os.Bundle;
import android.view.View;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;
import com.example.alex.myapidemos.tools.LogTool;

public class OverscanActivity extends BaseActivity implements View.OnClickListener{
	private final String TAG = OverscanActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.overscan_activity);
		findViewById(R.id.content).setOnClickListener(this);
		findViewById(R.id.overscan).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		LogTool.d(TAG, "onClick v.id"+v.getId());
		switch (v.getId()) {
		case R.id.content:
			findViewById(R.id.content_frame).setVisibility(View.GONE);
			break;
		case R.id.overscan:
			findViewById(R.id.content_frame).setVisibility(View.VISIBLE);
			break;
		default:
			break;
		}
	}
}

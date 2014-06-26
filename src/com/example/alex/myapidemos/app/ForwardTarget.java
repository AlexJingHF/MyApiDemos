package com.example.alex.myapidemos.app;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import com.example.alex.myapidemos.base.BaseActivity;

public class ForwardTarget extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(this);
		tv.setText("点击返回退出Activity，注意你将不会退回之前的Activity");
		tv.setGravity(Gravity.CENTER);
//		tv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		setContentView(tv);
	}
}

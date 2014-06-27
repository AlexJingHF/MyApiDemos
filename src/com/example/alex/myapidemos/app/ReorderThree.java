package com.example.alex.myapidemos.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.alex.myapidemos.base.BaseActivity;

public class ReorderThree extends BaseActivity {
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	LinearLayout l = new LinearLayout(this);
	TextView textView = new TextView(this);
	Button button = new Button(this);
	textView.setText("这是第三个Activity");
	button.setText("去第四个Activity");
	l.setOrientation(LinearLayout.VERTICAL);
	l.addView(textView);
	l.addView(button);
	setContentView(l);
	button.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			 startActivity(new Intent(ReorderThree.this, ReorderFour.class));
		}
	});
}
}

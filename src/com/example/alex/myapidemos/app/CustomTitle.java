package com.example.alex.myapidemos.app;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class CustomTitle extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.custom_title);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.custom_title_1);
		final TextView leftText = (TextView) findViewById(R.id.left_text);
		final TextView rightText = (TextView) findViewById(R.id.right_text);
		final TextView leftTextEdit = (TextView) findViewById(R.id.left_text_edit);
		final TextView rightTextEdit = (TextView) findViewById(R.id.right_text_edit);
		findViewById(R.id.left_text_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						leftText.setText(leftTextEdit.getText().toString());
					}
				});

		findViewById(R.id.right_text_button).setOnClickListener(
				new OnClickListener() {

					@Override
					public void onClick(View v) {
						rightText.setText(rightTextEdit.getText().toString());
					}
				});
	}
}

package com.example.alex.myapidemos.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class FinishAffinity extends BaseActivity{

	int mNesting;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_finish_affinity);
		
		mNesting = getIntent().getIntExtra("nesting", 1);
		((TextView)findViewById(R.id.seq)).setText("µ±Ç°Ç¶Ì×:"+mNesting);
		
		findViewById(R.id.nest).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(FinishAffinity.this, FinishAffinity.class);
				intent.putExtra("nesting", mNesting+1);
				startActivity(intent);
			}
		});
		
		findViewById(R.id.finish).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finishAffinity();
			}
		});
	}
}

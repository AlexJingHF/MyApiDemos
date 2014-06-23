package com.example.alex.myapidemos.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class AnimationActivity extends BaseActivity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_animation);
		findViewById(R.id.fade_animation).setOnClickListener(this);
		findViewById(R.id.zoom_animation).setOnClickListener(this);
		findViewById(R.id.modern_fade_animation);
		findViewById(R.id.modern_zoom_animation);
		findViewById(R.id.scale_up_animation);
		findViewById(R.id.zoom_thumbnail_animation);
	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(this, HelloWorld.class);
		switch (v.getId()) {
		case R.id.fade_animation:
			startActivity(intent);
			overridePendingTransition(R.anim.fade, R.anim.hold);
			break;
		case R.id.zoom_animation:
			startActivity(intent);
			overridePendingTransition(R.anim.zoom_enter, R.anim.zoom_exit);
			break;
		case R.id.modern_fade_animation:
			
			break;
		case R.id.modern_zoom_animation:
			
			break;
		case R.id.scale_up_animation:
			
			break;
		case R.id.zoom_thumbnail_animation:
			
			break;
			
		default:
			break;
		}
	}
}

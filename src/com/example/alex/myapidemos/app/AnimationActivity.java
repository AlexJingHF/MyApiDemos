package com.example.alex.myapidemos.app;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Bitmap;
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
		findViewById(R.id.modern_fade_animation).setOnClickListener(this);
		findViewById(R.id.modern_zoom_animation).setOnClickListener(this);
		findViewById(R.id.scale_up_animation).setOnClickListener(this);
		findViewById(R.id.zoom_thumbnail_animation).setOnClickListener(this);
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
			ActivityOptions options = ActivityOptions.makeCustomAnimation(this, R.anim.fade, R.anim.hold);
			startActivity(intent, options.toBundle());
			break;
		case R.id.modern_zoom_animation:
			ActivityOptions options2 =ActivityOptions.makeCustomAnimation(this, R.anim.zoom_enter, R.anim.zoom_exit);
			startActivity(intent,options2.toBundle());
			break;
		case R.id.scale_up_animation:
			ActivityOptions options3 = ActivityOptions.makeScaleUpAnimation(v, 0, 0, v.getWidth(), v.getHeight());
			startActivity(intent, options3.toBundle());
			break;
		case R.id.zoom_thumbnail_animation:
			v.setDrawingCacheEnabled(true);
			v.setPressed(false);
			v.refreshDrawableState();
			Bitmap bitmap = v.getDrawingCache();
//			Canvas canvas = new Canvas(bitmap);
			ActivityOptions options4 = ActivityOptions.makeThumbnailScaleUpAnimation(v, bitmap, 0, 0);
			startActivity(intent, options4.toBundle());
			v.getDrawingCache(false);
			break;
			
		default:
			break;
		}
	}
}

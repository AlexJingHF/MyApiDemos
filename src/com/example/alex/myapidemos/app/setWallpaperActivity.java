package com.example.alex.myapidemos.app;

import java.io.IOException;

import android.app.WallpaperManager;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class setWallpaperActivity extends BaseActivity {
    final static private int[] mColors =
        {Color.BLUE, Color.GREEN, Color.RED, Color.LTGRAY, Color.MAGENTA, Color.CYAN,
                Color.YELLOW, Color.WHITE, Color.TRANSPARENT};
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.wallpaper_2);
    	final WallpaperManager wallpaperManager = WallpaperManager.getInstance(this);
    	final Drawable wallpaperDrawable = wallpaperManager.getDrawable();
    	final ImageView imageView = (ImageView) findViewById(R.id.imageView);
    	imageView.setDrawingCacheEnabled(true);
    	imageView.setImageDrawable(wallpaperDrawable);
    	
    	findViewById(R.id.randomize).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int mColor = (int)Math.floor(Math.random()*mColors.length);
				wallpaperDrawable.setColorFilter(mColors[mColor], PorterDuff.Mode.MULTIPLY);
				imageView.setImageDrawable(wallpaperDrawable);
				imageView.invalidate();
			}
		});
    	
    	findViewById(R.id.setwallpaper).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try {
					wallpaperManager.setBitmap(imageView.getDrawingCache());
					finish();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
    }

}

package com.example.alex.myapidemos.app;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class DialogActivity extends BaseActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_LEFT_ICON);
		setContentView(R.layout.dialog_activity);
		getWindow().setTitle("This is DialogActivity");
		getWindow().setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, android.R.drawable.ic_dialog_alert);
		findViewById(R.id.add).setOnClickListener(mAddContentListener);
		findViewById(R.id.remove).setOnClickListener(mRemoveContentListener);
	}
	
    private OnClickListener mAddContentListener = new OnClickListener() {
        public void onClick(View v) {
            LinearLayout layout = (LinearLayout)findViewById(R.id.inner_content);
            ImageView iv = new ImageView(DialogActivity.this);
            iv.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher));
            iv.setPadding(4, 4, 4, 4);
            layout.addView(iv);
        }
    };
    
    private OnClickListener mRemoveContentListener = new OnClickListener() {
        public void onClick(View v) {
            LinearLayout layout = (LinearLayout)findViewById(R.id.inner_content);
            int num = layout.getChildCount();
            if (num > 0) {
                layout.removeViewAt(num-1);
            }
        }
    };
}

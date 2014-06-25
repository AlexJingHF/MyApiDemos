package com.example.alex.myapidemos.app;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class SoftInputModes extends BaseActivity {

	Spinner mResizeMode;
	final CharSequence[] mResizeModeLabels = new CharSequence[]{
			"Unspecified","Resize","Pan","Nothing"
	};
	
	final int[] mResizeModeValues = new int[]{
		WindowManager.LayoutParams.SOFT_INPUT_ADJUST_UNSPECIFIED,
		WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE,
		WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN,
		WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING,
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.soft_input_modes);
		mResizeMode = (Spinner) findViewById(R.id.resize_mode);
		ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_spinner_item, mResizeModeLabels);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mResizeMode.setAdapter(adapter);
		getWindow().setSoftInputMode(mResizeModeValues[0]);
		mResizeMode.setSelection(0);
		mResizeMode.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				getWindow().setSoftInputMode(mResizeModeValues[position]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				getWindow().setSoftInputMode(mResizeModeValues[0]);
			}
		});
	}
}

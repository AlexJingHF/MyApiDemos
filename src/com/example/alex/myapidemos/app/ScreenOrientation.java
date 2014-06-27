package com.example.alex.myapidemos.app;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class ScreenOrientation extends BaseActivity {

	Spinner mSpinner;

	final static int mOrientationValues[] = new int[] {
			ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED,
			ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE,
			ActivityInfo.SCREEN_ORIENTATION_PORTRAIT,
			ActivityInfo.SCREEN_ORIENTATION_USER,
			ActivityInfo.SCREEN_ORIENTATION_BEHIND,
			ActivityInfo.SCREEN_ORIENTATION_SENSOR,
			ActivityInfo.SCREEN_ORIENTATION_NOSENSOR,
			ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE,
			ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT,
			ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE,
			ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT,
			ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR,
			ActivityInfo.SCREEN_ORIENTATION_USER_LANDSCAPE,
			ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT,
			ActivityInfo.SCREEN_ORIENTATION_FULL_USER,
			ActivityInfo.SCREEN_ORIENTATION_LOCKED, };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.screen_orientation);

		mSpinner = (Spinner) findViewById(R.id.orientation);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.screen_orientations,
				android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		mSpinner.setAdapter(adapter);
		mSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				setRequestedOrientation(mOrientationValues[position]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED);
			}
		});
	}

}

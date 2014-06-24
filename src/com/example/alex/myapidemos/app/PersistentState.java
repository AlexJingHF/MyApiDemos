package com.example.alex.myapidemos.app;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class PersistentState extends BaseActivity {

	private EditText mSaved;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.save_restore_state);
		((TextView)findViewById(R.id.msg)).setText("³ÖÐø»¯×´Ì¬");
		mSaved = (EditText) findViewById(R.id.saved);
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		
		SharedPreferences sharedPreferences = getPreferences(0);
		String restoredText = sharedPreferences.getString("text", null);
		if (restoredText !=null) {
			mSaved.setText(restoredText,TextView.BufferType.EDITABLE);
			
			int selectionStart = sharedPreferences.getInt("selection-start", -1);
			int selectionEnd = sharedPreferences.getInt("selection-end", -1);
			if (selectionEnd!=-1 && selectionStart != -1) {
				mSaved.setSelection(selectionStart, selectionEnd);
			}
		}
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		
		SharedPreferences.Editor editor = getPreferences(0).edit();
		editor.putString("text", mSaved.getText().toString());
		editor.putInt("selection-start", mSaved.getSelectionStart());
		editor.putInt("selection-end", mSaved.getSelectionEnd());
		editor.commit();
	}
}

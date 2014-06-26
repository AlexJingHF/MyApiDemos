package com.example.alex.myapidemos.app;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.alex.myapidemos.R;
import com.example.alex.myapidemos.base.BaseActivity;

public class ReceiveResult extends BaseActivity {
	
	TextView mResult;
	static final private int GET_CODE = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.receive_result);
		mResult = (TextView) findViewById(R.id.results);
		
		mResult.setText(mResult.getText(),TextView.BufferType.EDITABLE);
		
		findViewById(R.id.get).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
	            Intent intent = new Intent(ReceiveResult.this, SendResult.class);
	            startActivityForResult(intent, GET_CODE);
	            
			}
		});
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == GET_CODE) {
			Editable text = (Editable) mResult.getText();
			if (resultCode == RESULT_CANCELED) {
				text.append("cancelled");
			}else {
				text.append("(okey ");
				text.append(Integer.toString(resultCode));
				text.append(")");
				if (data != null) {
					text.append(data.getAction());
				}
			}
			text.append("\n");
		}
		
	}
}

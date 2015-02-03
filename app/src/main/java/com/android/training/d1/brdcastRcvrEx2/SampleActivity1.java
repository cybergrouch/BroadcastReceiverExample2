package com.android.training.d1.brdcastRcvrEx2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SampleActivity1 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TextView textView = (TextView) findViewById(R.id.tv);
		textView.setText("SampleActivity 1");
		
	}

}

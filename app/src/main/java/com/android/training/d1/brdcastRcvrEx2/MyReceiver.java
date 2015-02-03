package com.android.training.d1.brdcastRcvrEx2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent loadActivity = null;
		
//		Starts the Activity for the corresponding action
		if (intent.getAction().equals("1")) {
			
			Log.i("MyReceiver", "Inside MyReceiver: " + intent.getAction());
			
			loadActivity = new Intent(context, SampleActivity1.class);
			loadActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(loadActivity);
			
		} else if (intent.getAction().equals("2")) {
			
			Log.i("MyReceiver", "Inside MyReceiver: " + intent.getAction());
			
			loadActivity = new Intent(context, SampleActivity2.class);
			loadActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(loadActivity);
		}
	}

}

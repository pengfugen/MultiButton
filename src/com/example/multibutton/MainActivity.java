package com.example.multibutton;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends Activity {

	private String TAG ="MultiButton"; 
	private MultiButton mButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mButton = (MultiButton)this.findViewById(R.id.multibuttom);
		mButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d(TAG, "MultiButton=================onClick");
				
			}
		});
		
	}

	
	
	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		if(ev.getAction() == MotionEvent.ACTION_DOWN)
		{
			Log.d(TAG, "MainActivity---->dispatchTouchEvent============MotionEvent.ACTION_DOWN");
		}
		else if(ev.getAction() == MotionEvent.ACTION_UP)
		{
			Log.d(TAG, "MainActivity---->dispatchTouchEvent============MotionEvent.ACTION_UP");
		}
		return super.dispatchTouchEvent(ev);
	}



	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if(event.getAction() == MotionEvent.ACTION_DOWN)
		{
			Log.d(TAG, "MainActivity---->onTouchEvent============MotionEvent.ACTION_DOWN");
		}
		else if(event.getAction() == MotionEvent.ACTION_UP)
		{
			Log.d(TAG, "MainActivity---->onTouchEvent============MotionEvent.ACTION_UP");
		}
		return super.onTouchEvent(event);
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
}

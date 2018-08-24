package com.example.multibutton;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MultiButton extends LinearLayout {

	private String TAG = "MultiButton";
	private ImageView mImageTop;
	private ImageView mImageBottom;
	private TextView mTextView;
	
	public MultiButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}
	
	private void init(Context con)
	{
		LayoutInflater inflater = LayoutInflater.from(con);
		View view = inflater.inflate(R.layout.multibutton,this,true);
		mImageTop = (ImageView)view.findViewById(R.id.image_top);
		mImageBottom = (ImageView)view.findViewById(R.id.image_bottom);
		mImageTop.setOnClickListener(new ImageViewOnClickListener());
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		if(ev.getAction() == MotionEvent.ACTION_DOWN)
		{
			Log.d(TAG, "MultiButton---->dispatchTouchEvent============MotionEvent.ACTION_DOWN");
		}
		else if(ev.getAction() == MotionEvent.ACTION_UP)
		{
			Log.d(TAG, "MultiButton---->dispatchTouchEvent============MotionEvent.ACTION_UP");
		}
		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub
		//return super.onInterceptTouchEvent(ev); //使用该方法
		return true;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if(event.getAction() == MotionEvent.ACTION_DOWN)
		{
			Log.d(TAG, "MultiButton---->onTouchEvent============MotionEvent.ACTION_DOWN");
		}
		else if(event.getAction() == MotionEvent.ACTION_UP)
		{
			Log.d(TAG, "MultiButton---->onTouchEvent============MotionEvent.ACTION_UP");
		}
		return super.onTouchEvent(event);
	}

	private class ImageViewOnClickListener implements View.OnClickListener
	{

		@Override
		public void onClick(View v) {
			Log.d(TAG, "ImageView---->ImageViewOnClickListener============onClick");
		}
		
	}
	
}

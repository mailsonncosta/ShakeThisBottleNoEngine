package com.example.shakethisbottlenoengine.minigame4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.shakethisbottlenoengine.R;

public class FixThisMessStartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_screen);
		
		View start_button = findViewById(R.id.start_button);
		start_button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(FixThisMessStartActivity.this, FixThisMessGameActivity.class);
				startActivity(intent);
			}
		});
		
	}

//	private void checkTime() {
//		// TODO Auto-generated method stub
//		TimerHelper timerHelper = new TimerHelper();
//		boolean timeElapsed = false;
//		while(!timeElapsed){
//			if(timerHelper.getElapsedTimeInSeconds() == 2){
//				timeElapsed = true;
//			}
//		}
//		return;
//	}
	
	
}

package com.example.shakethisbottlenoengine.minigame4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.shakethisbottlenoengine.R;
import com.example.shakethisbottlenoengine.main.TimerHelper;

public class StartScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_screen);
		
		checkTime();
		
		Intent intent = new Intent(this, GameActivity.class);
		startActivity(intent);
		
	}

	private void checkTime() {
		// TODO Auto-generated method stub
		TimerHelper timerHelper = new TimerHelper();
		boolean timeElapsed = false;
		while(!timeElapsed){
			if(timerHelper.getElapsedTimeInSeconds() == 2){
				timeElapsed = true;
			}
		}
		return;
	}
	
	
}

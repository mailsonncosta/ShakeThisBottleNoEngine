package com.example.shakethisbottlenoengine.minigame4;

import com.example.shakethisbottlenoengine.MainActivity;
import com.example.shakethisbottlenoengine.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class FixThisMessGameOverActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.game_over_activity);
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

}

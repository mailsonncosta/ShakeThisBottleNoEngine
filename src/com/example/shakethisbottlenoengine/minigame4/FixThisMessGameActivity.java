package com.example.shakethisbottlenoengine.minigame4;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shakethisbottlenoengine.R;
import com.example.shakethisbottlenoengine.main.GameFactory;
import com.example.shakethisbottlenoengine.main.MiniGame2;
import com.example.shakethisbottlenoengine.main.MiniGameType;
import com.example.shakethisbottlenoengine.main.TimerHelper;
 
public class FixThisMessGameActivity extends Activity {
 
	GridView gridView;
	
	private MiniGame2 game;

	private int counter;
	
	private TimerHelper timerHelper;
	
	static final String[] letters = new String[] { 
		"A", "B", "C", "D", "E",
		"F", "G", "H", "I", "J",
		"K", "L", "M", "N", "O",
		"P", "Q", "R", "S", "T",
		"U", "V", "W", "X", "Y", "Z"};
 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
 
		setContentView(R.layout.grid_view2);
 
		gridView = (GridView) findViewById(R.id.gridView1);
		
		//get selected game 
		game = (MiniGame2) GameFactory.getInstance().getMiniGame(MiniGameType.MINIGAME2);
		String[] shuffledLetters = game.getShuffledLetters();
		timerHelper = new TimerHelper();
		counter = 0;
 
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, shuffledLetters);
		gridView.setAdapter(adapter);
 
		gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
				int position, long id) {
			   Toast.makeText(getApplicationContext(),
				((TextView) v).getText(), Toast.LENGTH_SHORT).show();
			   
			   v.setBackgroundColor(Color.GRAY);
			   String selectedLetter = ((TextView) v).getText().toString();
			   checkLetter(selectedLetter);
			}
		});
		
	}

	protected void checkLetter(String selectedLetter) {
		// TODO Auto-generated method stub
		if(!letters[counter].equals(selectedLetter)){
//			   Toast.makeText(getApplicationContext(),
//						"You have failed the sequence. ", Toast.LENGTH_SHORT).show();
			   
			   Intent intent = new Intent(this, FixThisMessGameOverActivity.class);
			   startActivity(intent);
			   //System.exit(0);
		} else {
			counter++;
			if(counter == 26){
				Toast.makeText(getApplicationContext(),
						"Elapsed time: " + timerHelper.getElapsedTimeInSeconds(), Toast.LENGTH_SHORT).show();
			}
		}
	}
 
}
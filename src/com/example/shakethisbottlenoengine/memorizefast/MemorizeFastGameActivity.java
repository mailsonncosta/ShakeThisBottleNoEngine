package com.example.shakethisbottlenoengine.memorizefast;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.shakethisbottlenoengine.R;
import com.example.shakethisbottlenoengine.ShakeITCongratsActivity;
import com.example.shakethisbottlenoengine.ShakeITFailActivity;


public class MemorizeFastGameActivity extends ActionBarActivity{
	
	private Button trueFirstBt, trueSecondBt, trueThirdBt, trueFourthBt,chooseFirstBt,chooseSecondBt, chooseThirdBt,chooseFourthBt,colorRedBt,colorGreenBt,colorYellowBt,colorBlueBt;
	private ArrayList<Button> colorsSequence;
	private ArrayList<Button> chooseColors;
	private MemorizeFast game;
	private int counter;
	
	private Button congratsTestBt, failtestBt;

	
	
	
	private OnClickListener changingLayouts(final Class<?> nextLayout){
		return new OnClickListener() {
		@Override
		public void onClick(View v) {
			
			Intent trocaDeTela = new Intent(MemorizeFastGameActivity.this, nextLayout);
			MemorizeFastGameActivity.this.startActivity(trocaDeTela);
			MemorizeFastGameActivity.this.finish();
		}
		};
	}
	
	
	
	private void showSequence(){
		for(int i =0; i<4;i++){}
			
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memorizefast_game_activity_main);
        
        game = new MemorizeFast();
        colorsSequence = new ArrayList<Button>();
        chooseColors   = new ArrayList<Button>();
        
        //sequencia real
        trueFirstBt  = (Button) findViewById(R.id.memorize_fast_true_first);
        trueSecondBt = (Button) findViewById(R.id.memorize_fast_true_second);
        trueThirdBt  = (Button) findViewById(R.id.memorize_fast_true_third);
        trueFourthBt = (Button) findViewById(R.id.memorize_fast_true_fourth);
        
        //sequencia escolhida
        chooseFirstBt = (Button) findViewById(R.id.memorize_fast_chance_first);
        chooseSecondBt= (Button) findViewById(R.id.memorize_fast_chance_second);
        chooseThirdBt = (Button) findViewById(R.id.memorize_fast_chance_third);
        chooseFourthBt= (Button) findViewById(R.id.memorize_fast_chance_fourth);
        
        //botoes de cores
        colorRedBt   = (Button) findViewById(R.id.memorize_fast_color_red);
        colorYellowBt= (Button) findViewById(R.id.memorize_fast_color_yellow);
        colorGreenBt = (Button) findViewById(R.id.memorize_fast_color_green);
        colorBlueBt  = (Button) findViewById(R.id.memorize_fast_color_blue);
        
        colorsSequence.add(trueFirstBt);
        colorsSequence.add(trueSecondBt);
        colorsSequence.add(trueThirdBt);
        colorsSequence.add(trueFourthBt);
        
        for(int i =0; i < game.getSequence().size() ;i++){
        	if(game.getSequence().get(i)== 0)	  colorsSequence.get(i).setBackgroundResource(R.drawable.memorize_hit_circle_red);
        	else if(game.getSequence().get(i)== 1)colorsSequence.get(i).setBackgroundResource(R.drawable.memorize_hit_circle_yellow);
        	else if(game.getSequence().get(i)== 2)colorsSequence.get(i).setBackgroundResource(R.drawable.memorize_hit_circle_green);
        	else if(game.getSequence().get(i)== 3)colorsSequence.get(i).setBackgroundResource(R.drawable.memorize_hit_circle_blue);
        }
        
        
        chooseColors.add(chooseFirstBt);
        chooseColors.add(chooseSecondBt);
        chooseColors.add(chooseThirdBt);
        chooseColors.add(chooseFourthBt);
        
        colorRedBt.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.addColors(0)){
					chooseColors.get(game.getNext()-1).setBackgroundResource(R.drawable.memorize_hit_circle_red);
				}
			}
		});
        
        colorYellowBt.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.addColors(1)){
					chooseColors.get(game.getNext()-1).setBackgroundResource(R.drawable.memorize_hit_circle_yellow);
				}
			}
		});
        
        colorGreenBt.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.addColors(2)){
					chooseColors.get(game.getNext()-1).setBackgroundResource(R.drawable.memorize_hit_circle_green);
				}
			}
		});
        
        colorBlueBt.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.addColors(3)){
					chooseColors.get(game.getNext()-1).setBackgroundResource(R.drawable.memorize_hit_circle_blue);
				}
			}
		});
        
        
        congratsTestBt= (Button) findViewById(R.id.teste_congrats);
        failtestBt    = (Button) findViewById(R.id.teste_fail);
        
        congratsTestBt.setOnClickListener(changingLayouts(ShakeITCongratsActivity.class));
        failtestBt.setOnClickListener(changingLayouts(ShakeITFailActivity.class));
       // if(game.gameClear()){changingLayouts(ShakeITCongratsActivity.class);}
       // game = new MemorizeFast(counter);
        
        //congratsTestBt= (Button) findViewById(R.id.teste_congrats);
        //failtestBt    = (Button) findViewById(R.id.teste_fail);
        
        //congratsTestBt.setOnClickListener(changingLayouts(ShakeITCongratsActivity.class));
        //failtestBt.setOnClickListener(changingLayouts(ShakeITFailActivity.class));
        
       
                
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


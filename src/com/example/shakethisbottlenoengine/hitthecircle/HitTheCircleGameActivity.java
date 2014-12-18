package com.example.shakethisbottlenoengine.hitthecircle;

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


public class HitTheCircleGameActivity extends ActionBarActivity{
	
	private Button button01, button02, button03,button04,button05,button06,button07,button08,button09,button10,button11,button12;
	private ArrayList<Button> buttons;
	private HitTheCircle game;
		
	private Button congratsTestBt, failtestBt;

	
	private OnClickListener changingLayouts(final Class<?> nextLayout){
		return new OnClickListener() {
		@Override
		public void onClick(View v) {
			
			Intent trocaDeTela = new Intent(HitTheCircleGameActivity.this, nextLayout);
			HitTheCircleGameActivity.this.startActivity(trocaDeTela);
			HitTheCircleGameActivity.this.finish();
		}
		};
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hit_the_circle_game_activity_main);
        
        game = new HitTheCircle();
        buttons = new ArrayList<Button>();
        
        button01 = (Button) findViewById(R.id.hit_circle_01);
        button02 = (Button) findViewById(R.id.hit_circle_02);
        button03 = (Button) findViewById(R.id.hit_circle_03);
        button04 = (Button) findViewById(R.id.hit_circle_04);
        button05 = (Button) findViewById(R.id.hit_circle_05);
        button06 = (Button) findViewById(R.id.hit_circle_06);
        button07 = (Button) findViewById(R.id.hit_circle_07);
        button08 = (Button) findViewById(R.id.hit_circle_08);
        button09 = (Button) findViewById(R.id.hit_circle_09);
        button10 = (Button) findViewById(R.id.hit_circle_10);
        button11 = (Button) findViewById(R.id.hit_circle_11);
        button12 = (Button) findViewById(R.id.hit_circle_12);
        
        buttons.add(button01);
        buttons.add(button02);
        buttons.add(button03);
        buttons.add(button04);
        buttons.add(button05);
        buttons.add(button06);
        buttons.add(button07);
        buttons.add(button08);
        buttons.add(button09);
        buttons.add(button10);
        buttons.add(button11);
        buttons.add(button12);
        
       for(int i = 0;i< game.getSequence().size();i++){
        	if(game.getSequence().get(i)== true){
        		buttons.get(i).setBackgroundResource(R.drawable.memorize_hit_square_red);
        	}else{
        		buttons.get(i).setBackgroundResource(R.drawable.memorize_hit_circle_red);
        	}
        }
        
        button01.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(0)){
					button01.setBackgroundResource(R.drawable.memorize_hit_square_red);
				}
			}
		});
        
        button02.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(1)){button02.setBackgroundResource(R.drawable.memorize_hit_square_red);}
			}
		});
        
        button03.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(2)){button03.setBackgroundResource(R.drawable.memorize_hit_square_red);}
			}
		});
        
        button04.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(3)){button04.setBackgroundResource(R.drawable.memorize_hit_square_red);}
			}
		});
        
        button05.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(4)){button05.setBackgroundResource(R.drawable.memorize_hit_square_red);}
			}
		});
        
        button06.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(5)){button06.setBackgroundResource(R.drawable.memorize_hit_square_red);}
			}
		});
        
        button07.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(6)){button07.setBackgroundResource(R.drawable.memorize_hit_square_red);}
			}
		});
        
        button08.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(7)){button08.setBackgroundResource(R.drawable.memorize_hit_square_red);}
			}
		});
        
        button09.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(8)){button09.setBackgroundResource(R.drawable.memorize_hit_square_red);}
			}
		});
        
        button10.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(9)){button10.setBackgroundResource(R.drawable.memorize_hit_square_red);}
			}
		});
        
        button11.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(10)){button11.setBackgroundResource(R.drawable.memorize_hit_square_red);}
			}
		});
        
        button12.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(game.hitting(11)){button12.setBackgroundResource(R.drawable.memorize_hit_square_red);}
			}
		});
        
        if(game.complete())changingLayouts(ShakeITCongratsActivity.class);
        
        
        congratsTestBt= (Button) findViewById(R.id.teste_congrats);
        failtestBt    = (Button) findViewById(R.id.teste_fail);
        
        congratsTestBt.setOnClickListener(changingLayouts(ShakeITCongratsActivity.class));
        failtestBt.setOnClickListener(changingLayouts(ShakeITFailActivity.class));
        
        
        //RelativeLayout layout =(RelativeLayout)findViewById(R.id.background);
        //layout.setBackgroundResource(R.drawable.ready);
        //game.
        
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


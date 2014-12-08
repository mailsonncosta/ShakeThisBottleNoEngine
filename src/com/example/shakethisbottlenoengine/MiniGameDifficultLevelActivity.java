package com.example.shakethisbottlenoengine;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MiniGameDifficultLevelActivity extends ActionBarActivity {

private Button hardBt, normalBt, easyBt;
	
	private OnClickListener changingLayouts(final Class<?> nextLayout){
		return new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent trocaDeTela = new Intent(MiniGameDifficultLevelActivity.this, nextLayout);
			MiniGameDifficultLevelActivity.this.startActivity(trocaDeTela);
			MiniGameDifficultLevelActivity.this.finish();
		}
		};
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minigame_dificultselect_activity_main);
        
        hardBt   = (Button) findViewById(R.id.hard_level_bt);
        normalBt = (Button) findViewById(R.id.normal_level_bt);
        easyBt   = (Button) findViewById(R.id.easy_level_bt);
        
        hardBt.setOnClickListener(changingLayouts(ShakeITExplanationActivity.class));
        normalBt.setOnClickListener(changingLayouts(ShakeITExplanationActivity.class));
        easyBt.setOnClickListener(changingLayouts(ShakeITExplanationActivity.class));
        
        
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

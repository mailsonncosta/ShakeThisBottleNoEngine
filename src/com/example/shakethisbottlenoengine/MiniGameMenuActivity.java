package com.example.shakethisbottlenoengine;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MiniGameMenuActivity extends ActionBarActivity {

	private Button shakeItBt;
	
	private OnClickListener changingLayouts(final Class<?> nextLayout){
		return new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent trocaDeTela = new Intent(MiniGameMenuActivity.this, nextLayout);
			MiniGameMenuActivity.this.startActivity(trocaDeTela);
			MiniGameMenuActivity.this.finish();
		}
		};
	}
		
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minigames_menu_activity_main);
        
        
        shakeItBt = (Button) findViewById(R.id.shake_it_bt);
                
        shakeItBt.setOnClickListener(changingLayouts(MiniGameDifficultLevelActivity.class));
        
    }

    @Override
    public void onBackPressed() {
       Intent intent = new Intent(this, MainActivity.class);
       intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
       startActivity(intent);
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

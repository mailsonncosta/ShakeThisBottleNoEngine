package com.example.shakethisbottlenoengine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

	private Button minigameBt, exitBt;
	
	private OnClickListener changingLayouts(final Class<?> nextLayout){
		return new OnClickListener() {
		@Override
		public void onClick(View v) {
			
			Intent trocaDeTela = new Intent(MainActivity.this, nextLayout);
			MainActivity.this.startActivity(trocaDeTela);
			MainActivity.this.finish();
		}
		};
	}

	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        minigameBt = (Button) findViewById(R.id.minigames_bt);
        exitBt     = (Button) findViewById(R.id.exit_bt);
        
        
        minigameBt.setOnClickListener(changingLayouts(MiniGameMenuActivity.class));
        
        exitBt.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) { System.exit(0);}
		});


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

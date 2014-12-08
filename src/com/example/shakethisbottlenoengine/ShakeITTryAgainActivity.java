package com.example.shakethisbottlenoengine;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class ShakeITTryAgainActivity extends ActionBarActivity {

	private Button tryAgainBt,backToMenuBt;
	
	
	private OnClickListener changingLayouts(final Class<?> nextLayout){
		return new OnClickListener() {
		@Override
		public void onClick(View v) {
			
			Intent trocaDeTela = new Intent(ShakeITTryAgainActivity.this, nextLayout);
			ShakeITTryAgainActivity.this.startActivity(trocaDeTela);
			ShakeITTryAgainActivity.this.finish();
		}
		};
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shakeit_try_again_activity_main);
        
        tryAgainBt   = (Button) findViewById(R.id.try_again_bt);
        backToMenuBt = (Button) findViewById(R.id.tya_btm_bt);
        
        tryAgainBt.setOnClickListener(changingLayouts(ShakeITStartActivity.class));
        backToMenuBt.setOnClickListener(changingLayouts(MainActivity.class));
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

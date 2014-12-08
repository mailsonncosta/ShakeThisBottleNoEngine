package com.example.shakethisbottlenoengine;

import org.w3c.dom.Text;

import android.support.v7.app.ActionBarActivity;
import android.test.suitebuilder.annotation.LargeTest;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class ShakeITCongratsActivity extends ActionBarActivity {
	private Button goToMenuBt;
	//private LargeTest score;
	
	private OnClickListener changingLayouts(final Class<?> nextLayout){
		return new OnClickListener() {
		@Override
		public void onClick(View v) {
			
			Intent trocaDeTela = new Intent(ShakeITCongratsActivity.this, nextLayout);
			ShakeITCongratsActivity.this.startActivity(trocaDeTela);
			ShakeITCongratsActivity.this.finish();
		}
		};
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shakeit_congrats_activity_main);
        
        goToMenuBt = (Button) findViewById(R.id.congratulations_bt);
        //score = (LargeTest) findViewById(R.id.shakeit_score_tx);
        
        goToMenuBt.setOnClickListener(changingLayouts(MainActivity.class));
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

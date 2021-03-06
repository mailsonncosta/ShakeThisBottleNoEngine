package com.example.shakethisbottlenoengine;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class ShakeITExplanationActivity extends ActionBarActivity {
	private Button backBt, goBt;
	
	private OnClickListener changingLayouts(final Class<?> nextLayout){
		return new OnClickListener() {
		@Override
		public void onClick(View v) {
			
			Intent trocaDeTela = new Intent(ShakeITExplanationActivity.this, nextLayout);
			ShakeITExplanationActivity.this.startActivity(trocaDeTela);
			ShakeITExplanationActivity.this.finish();
		}
		};
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shakeit_explanation_activity_main);
        
        backBt = (Button) findViewById(R.id.btm_explanation_bt);
        goBt   = (Button) findViewById(R.id.pass_explanation_bt);
        
        
        backBt.setOnClickListener(changingLayouts(MiniGameDifficultLevelActivity.class));
        goBt.setOnClickListener(changingLayouts(ShakeITStartActivity.class));

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

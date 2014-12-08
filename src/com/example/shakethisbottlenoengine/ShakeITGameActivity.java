package com.example.shakethisbottlenoengine;

import java.util.List;
import java.util.Timer;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class ShakeITGameActivity extends ActionBarActivity implements SensorEventListener {
	
	private Button congratsTestBt, failtestBt;
	
	//sensor
	private countDown sec = new countDown(30);//30 segundos
    private int count = 0;
    
    private TextView texto, timer;
    
    private long last_update =0 , last_movement = 0;
    private float prevX = 0, prevY = 0,prevZ = 0;
    private float currX = 0, currY = 0,currZ = 0;
    
    //sensor
		
	private OnClickListener changingLayouts(final Class<?> nextLayout){
		return new OnClickListener() {
		@Override
		public void onClick(View v) {
			
			Intent trocaDeTela = new Intent(ShakeITGameActivity.this, nextLayout);
			ShakeITGameActivity.this.startActivity(trocaDeTela);
			ShakeITGameActivity.this.finish();
		}
		};
	}
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shakeit_game_activity_main);
        
        
        congratsTestBt= (Button) findViewById(R.id.teste_congrats);
        failtestBt    = (Button) findViewById(R.id.teste_fail);
        
        congratsTestBt.setOnClickListener(changingLayouts(ShakeITCongratsActivity.class));
        failtestBt.setOnClickListener(changingLayouts(ShakeITFailActivity.class));
        
             
        //-------------sensor---------
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    
        //-----timer------
        synchronized (this) {
        	sec.run();
            timer.setText("" + sec.getSec());
		}
                
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
///---------------------------------------------------Sensor------------------------------------------------------------
    
    
	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		//sec.run();
		synchronized (this) {
			long currentTime  = event.timestamp;
						
			currX = event.values[0];
			currY = event.values[1];
			currZ = event.values[2];
			
			
			
			 if (prevX == 0 && prevY == 0 && prevZ == 0) {
		            last_update   = currentTime;
		            last_movement = currentTime;
		            prevX = currX;
		            prevY = currY;
		            prevZ = currZ;
		        }
		 
		        long time_difference = currentTime - last_update + 25000000;//constante para se ajustar ao aceleromentro
		        if (time_difference > 0) {
		            float movement = Math.abs((currX + currY + currZ) - (prevX - prevY - prevZ)) / time_difference;
		            int limit = 1500;
		            float min_movement = 1E-6f;
		            if (movement > min_movement) {
		                if (currentTime - last_movement >= limit) {                    
		                    count++;
		                    if(count == 25 ){
		                    	Intent trocaDeTela = new Intent(ShakeITGameActivity.this, ShakeITCongratsActivity.class);
		            			ShakeITGameActivity.this.startActivity(trocaDeTela);
		            			ShakeITGameActivity.this.finish();
		                    }
		                }
		                last_movement = currentTime;
		            }
		            prevX = currX;
		            prevY = currY;
		            prevZ = currZ;
		            last_update = currentTime;
		        }
		        
		        /*if(sec.getSec() == 0){
                	Intent trocaDeTela = new Intent(ShakeITGameActivity.this, ShakeITFailActivity.class);
        			ShakeITGameActivity.this.startActivity(trocaDeTela);
        			ShakeITGameActivity.this.finish();
                }
                if(count ==25 && sec.getSec() >=0){
                	Intent trocaDeTela = new Intent(ShakeITGameActivity.this, ShakeITCongratsActivity.class);
        			ShakeITGameActivity.this.startActivity(trocaDeTela);
        			ShakeITGameActivity.this.finish();
                }*/
		        
		        texto = ((TextView) findViewById(R.id.shakeit_test));
		        texto.setText("Counter " + count);//sec.getSec());//count);
		}
		System.out.println("count = "+ count);
	}


	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	protected void onResume() {
	    super.onResume();
	    SensorManager sm = (SensorManager) getSystemService(SENSOR_SERVICE);
	    List<Sensor> sensors = sm.getSensorList(Sensor.TYPE_ACCELEROMETER);       
	    if (sensors.size() > 0) {
	        sm.registerListener(this, sensors.get(0), SensorManager.SENSOR_DELAY_GAME);
	    }
	}
	
	@Override
	protected void onStop() {
	    SensorManager sm = (SensorManager) getSystemService(SENSOR_SERVICE);       
	    sm.unregisterListener(this);
	    super.onStop();
	}
	
	 
	
}

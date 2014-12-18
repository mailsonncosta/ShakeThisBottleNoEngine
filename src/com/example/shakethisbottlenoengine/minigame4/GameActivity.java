package com.example.shakethisbottlenoengine.minigame4;

import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

import com.example.shakethisbottlenoengine.R;
import com.example.shakethisbottlenoengine.main.GameFactory;
import com.example.shakethisbottlenoengine.main.MiniGame1;
import com.example.shakethisbottlenoengine.main.MiniGameType;
import com.example.shakethisbottlenoengine.main.ShapeType;

public class GameActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_game3);
		
		//GridView grid = (GridView) findViewById(R.id.grid_of_shapes);
		
		GridView gridview = (GridView) findViewById(R.id.grid_view);
		
	    gridview.setAdapter(new ImageAdapter(this));

	    gridview.setOnItemClickListener(new OnItemClickListener() {
	        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
	            Toast.makeText(GameActivity.this, "" + position, Toast.LENGTH_SHORT).show();
	        }
	    });
		
		HashMap<ShapeType, String> map = new HashMap<ShapeType, String>();
		
		map.put(ShapeType.BLUE_CIRCLE, "blue_circle.png");
		map.put(ShapeType.RED_CIRCLE, "red_circle.png");
		map.put(ShapeType.GREEN_CIRCLE, "green_circle.png");
		map.put(ShapeType.YELLOW_CIRCLE, "yellow_circle.png");
		
		map.put(ShapeType.BLUE_SQUARE, "blue_square.png");
		map.put(ShapeType.RED_SQUARE, "red_square.png");
		map.put(ShapeType.GREEN_SQUARE, "green_square.png");
		map.put(ShapeType.YELLOW_SQUARE, "yellow_square.png");
		
		map.put(ShapeType.BLUE_TRIANGLE, "blue_triangle.png");
		map.put(ShapeType.RED_TRIANGLE, "red_triangle.png");
		map.put(ShapeType.GREEN_TRIANGLE, "green_triangle.png");
		map.put(ShapeType.YELLOW_TRIANGLE, "yellow_triangle.png");

		MiniGame1 game = (MiniGame1) GameFactory.getInstance()
				.getMiniGame(MiniGameType.MINIGAME1);
		
		populateScreen(game.getShapeMatrix());
		
	}

	private void populateScreen(ShapeType[][] shapeMatrix) {
		// TODO Auto-generated method stub
		
		
	}
}

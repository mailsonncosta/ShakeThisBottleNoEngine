package com.example.shakethisbottlenoengine.minigame4;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.shakethisbottlenoengine.R;

public class ImageAdapter extends BaseAdapter {
	
	private Context mContext;

	public ImageAdapter(Context c) {
		// TODO Auto-generated constructor stub
		this.mContext = c;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        System.out.println("position: " + position);
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
	}
	
    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.blue_square, R.drawable.blue_circle,
            R.drawable.blue_triangle, R.drawable.red_square,
            R.drawable.red_circle, R.drawable.red_triangle,
            R.drawable.green_square, R.drawable.green_circle,
            R.drawable.green_triangle, R.drawable.yellow_square,
            R.drawable.yellow_circle, R.drawable.yellow_triangle,
    };

}

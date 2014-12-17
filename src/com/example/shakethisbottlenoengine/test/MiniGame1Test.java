package com.example.shakethisbottlenoengine.test;

import com.example.shakethisbottlenoengine.main.MiniGame1;

public class MiniGame1Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniGame1 game1 = new MiniGame1();
		
		System.out.println(game1.getName());
		System.out.println(game1.getDescription());
		game1.getShapeMatrix();
		System.out.println(game1.toString());
	}

}

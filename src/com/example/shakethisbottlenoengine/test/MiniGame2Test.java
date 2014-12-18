package com.example.shakethisbottlenoengine.test;

import com.example.shakethisbottlenoengine.main.MiniGame2;

public class MiniGame2Test {
	
	public static void main(String[] args) {
		MiniGame2 game2 = new MiniGame2();
		
		String[] shuffledLetters = game2.getShuffledLetters();
		
		for(String s : shuffledLetters){
			System.out.println(s);
		}
		
	}

}

package com.example.shakethisbottlenoengine.main;

import java.util.Random;

public class MiniGame2 implements BaseGame {
	
	
	private static final String NAME = "Fix this mess";
	private static final String DESCRIPTION = "You must order the letters of the alphabet as fast as you can. ";
	
	static final String[] letters = new String[] { 
			"A", "B", "C", "D", "E",
			"F", "G", "H", "I", "J",
			"K", "L", "M", "N", "O",
			"P", "Q", "R", "S", "T",
			"U", "V", "W", "X", "Y", "Z"};
	
	private String[] letters2;

	public MiniGame2() {
		// TODO Auto-generated constructor stub
		shuffle();
	}

	private String[] shuffle() 
	{
		// TODO Auto-generated method stub
		letters2 = new String[26];
		
		Random random = new Random();
		
		for(int i = 0; i < 26; i++)
		{
			int nextInt = random.nextInt(26);
			letters2[i] = letters[nextInt];
		}
		
		return letters2;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NAME;
	}

	@Override
	public MiniGameType getType() {
		// TODO Auto-generated method stub
		return MiniGameType.MINIGAME2;
	}

	@Override
	public Integer getScore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getHighScore() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return DESCRIPTION;
	}

	@Override
	public void startGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pauseGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finishGame() {
		// TODO Auto-generated method stub
		
	}
	
	public String[] getShuffledLetters(){
		if(letters2 == null){
			throw new UnsupportedOperationException(); 
		}
		return letters2;
	}

}

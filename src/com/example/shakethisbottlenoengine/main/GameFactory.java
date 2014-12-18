package com.example.shakethisbottlenoengine.main;

/**
 * A factory for the games that can be created
 * @author Ítalo
 *
 */
public class GameFactory {

	public static GameFactory INSTANCE;
	
	private GameFactory(){};

	/**
	 * Returns the selected minigame.
	 * @param minigame1
	 */
	public BaseGame getMiniGame(MiniGameType minigame1) 
	{
		// TODO - implement GameFactory.getMiniGame
		if(minigame1.equals(MiniGameType.MINIGAME1)){
			return new MiniGame1();
		} else if(minigame1.equals(MiniGameType.MINIGAME2)){
			return new MiniGame2();
		} else {
			throw new UnsupportedOperationException();
		}
		
	}

	/**
	 * Returns the single instance of GameFactory.
	 * @return
	 */
	public static GameFactory getInstance() 
	{
		// TODO - implement GameFactory.getInstance
		if(INSTANCE == null){
			return new GameFactory();
		} else {
			return INSTANCE;
		}
	}

}
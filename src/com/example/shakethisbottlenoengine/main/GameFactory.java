package com.example.shakethisbottlenoengine.main;

/**
 * A factory for the games that can be created
 * @author Ítalo
 *
 */
public class GameFactory {

	public GameFactory INSTANCE;
	
	private GameFactory(){};

	/**
	 * Returns the selected minigame.
	 * @param Type
	 */
	public BaseGame getMiniGame(String Type) 
	{
		// TODO - implement GameFactory.getMiniGame
		if(Type.equals(MiniGameType.MINIGAME1)){
			return new MiniGame1();
		} else {
			throw new UnsupportedOperationException();
		}
		
	}

	/**
	 * Returns the single instance of GameFactory.
	 * @return
	 */
	public GameFactory getInstance() 
	{
		// TODO - implement GameFactory.getInstance
		if(INSTANCE == null){
			return new GameFactory();
		} else {
			return INSTANCE;
		}
	}

}
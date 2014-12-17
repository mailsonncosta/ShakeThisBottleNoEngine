package com.example.shakethisbottlenoengine.main;

import java.util.Random;

/**
 * Game logic and implementation for the 'Find the red circle' game.
 * @author Ítalo
 *
 */
public class MiniGame1 implements BaseGame {

	private static final String NAME = "FIND THE RED CIRCLE!";
	
	private ShapeType[][] shapeMatrix;

	private ShapeType PRIZED_SHAPE;

	private static final int NUMBEROFLINES = 3;
	private static final int NUMBEROFCOLUMNS = 3;

	private static final String DESCRIPTION = 
					"A simple game where you must find the indicated colored shape " +
					"as soon as possible.";

	public MiniGame1() 
	{
		// TODO Auto-generated constructor stub
		shapeMatrix = new ShapeType[NUMBEROFLINES][NUMBEROFCOLUMNS];
		PRIZED_SHAPE = getRandomPrizedShape();
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return NAME;
		
	}

	@Override
	public MiniGameType getType() {
		// TODO Auto-generated method stub
		return MiniGameType.MINIGAME1;
		
	}

	@Override
	public Integer getScore() {
		// TODO Auto-generated method stub
		
		// NOT IMPLEMENTED
		
		return null;
	}

	@Override
	public Integer getHighScore() {
		// TODO Auto-generated method stub
		
		// NOT IMPLEMENTED
		
		return null;		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return DESCRIPTION;
	}
	
//	=============================================
//			
//	   METHODS THAT IIMPLEMENT THE GAME LOGIC
//	
//  =============================================
	
	public ShapeType[][] getShapeMatrix()
	{
		Random random = new Random();
		
		for(int i = 0; i < NUMBEROFLINES; i++){
			for(int j = 0; j < NUMBEROFCOLUMNS; j++){
				int nextInt = random.nextInt(12);
				shapeMatrix[i][j] = getShapeType(nextInt);
				//System.out.println(shapeMatrix[i][j]);
			}
		}
		
		return shapeMatrix;
	}

     private ShapeType getShapeType(int nextInt) 
     {
	    // TODO Auto-generated method stub
    	 for(ShapeType shape : ShapeType.values()){
    		 if(shape.getShapeNumber() == nextInt){
    			 return shape;
    		 }
    	 }
    	 
    	 throw new UnsupportedOperationException();
     }
     
    private ShapeType getRandomPrizedShape() {
		// TODO Auto-generated method stub
    	Random random = new Random();
    	int nextInt = random.nextInt(12);
    	return getShapeType(nextInt);
	}
     
    public void shapeSelected(int i, int j) {
		// TODO Auto-generated method stub
    	if(isRightShapeSelected(i, j)){
    		playerWins();
    	} else {
    		gameOver();
    	}
	}
     
    private void playerWins() {
		// TODO Auto-generated method stub
		
	}

	private void gameOver() {
		// TODO Auto-generated method stub
		
	}

	public boolean isRightShapeSelected(int i, int j){
    	 if(shapeMatrix[i][j] == PRIZED_SHAPE){
    		 return true;
    	 }
		return false;
     }
    

//	=============================================
//			
//	   GENERAL METHODS
//	
//  =============================================
	
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	 String result = "";
    	 for(int i = 0; i < NUMBEROFLINES; i++){
    		 result = result + "[ ";
 			for(int j = 0; j < NUMBEROFCOLUMNS; j++){
 				result = result + shapeMatrix[i][j] + ", ";
 			}
 			result = result + " ]";
 		}
    	return result;
    }
	
	
}
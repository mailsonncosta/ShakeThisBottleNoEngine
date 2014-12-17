package com.example.shakethisbottlenoengine.main;

/**
 * A simple enumeration of shape types to be used in some game
 * @author Ítalo
 *
 */
public enum ShapeType {
	
	// circles
	BLUE_CIRCLE(0), 
	RED_CIRCLE(1), 
	GREEN_CIRCLE(2), 
	YELLOW_CIRCLE(3),
	//squares
	BLUE_SQUARE(4), 
	RED_SQUARE(5), 
	GREEN_SQUARE(6), 
	YELLOW_SQUARE(7),
	//triangles
	BLUE_TRIANGLE(8), 
	RED_TRIANGLE(9), 
	GREEN_TRIANGLE(10), 
	YELLOW_TRIANGLE(11);
	
	
	private int shapeNumber;

	ShapeType(int shapeNumber){
		this.setShapeNumber(shapeNumber);
	}

	public int getShapeNumber() {
		return shapeNumber;
	}

	public void setShapeNumber(int shapeNumber) {
		this.shapeNumber = shapeNumber;
	}

}

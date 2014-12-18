package com.example.shakethisbottlenoengine.hitthecircle;

import java.util.ArrayList;
import java.util.Collections;

import com.example.shakethisbottlenoengine.GameInfo;

public class HitTheCircle implements GameInfo {
	
	private long gameDuration;
	private long bonus;
	private long score;
	
	private ArrayList<Boolean> isSquare;
	
	//constructors
	public HitTheCircle(){
		isSquare = new ArrayList<Boolean>();
		buildGameSequence();
	}

	@Override
	public void setGameDuration(long time) {
		this.gameDuration = time;
	}
	@Override
	public void setGameBonus(long bonus) {
		this.bonus = bonus;
	}
	@Override
	public void setScorePoints(long points) {
		this.score = points;
	}
	@Override
	public void setDifficulty(int difficulty) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public long getGameDuration() {
		return this.gameDuration;
	}
	@Override
	public long getGameBonus() {
		return this.bonus;
	}
	@Override
	public long getGameScore() {
		return this.score;
	}
	@Override
	public int getDifficulty() {
		return 0;
	}
	@Override
	public long getGameVictoryPoints() {
		return this.score+ this.bonus;
	}
	//game methods
	
	/**
	 * build the array and mixes the square with the circle
	 */
	private void buildGameSequence(){
		
		for(int i = 0;i <= 5;i++) {
			isSquare.add(true);
		}
		
		for(int i = 6;i <= 11;i++) {
			isSquare.add(false);
		}
	
		Collections.shuffle(isSquare);
	}
	
		
	/**
	 * Returns true, if the player hits the circle
	 * @return
	 */
	public boolean hitting(int position){
		if(position >= 0 && position <= 11){
			synchronized (this) {
				if(isSquare.get(position)== false){ 
					isSquare.set(position, true);
					return true;
				}else{ return false;}	
			}
		}
		return false;
	}
	
	/**
	 * Returns true if there's only square in the ArrayList
	 * @return
	 */
	public boolean complete(){
		for(int i=0; i<isSquare.size();i++){if(isSquare.get(i)==false){ return false;}	}// if there is a circle returns false
		return true;
	}
	
	public ArrayList<Boolean> getSequence(){ return isSquare;}
}

package com.example.shakethisbottlenoengine.memorizefast;

import java.util.ArrayList;
import java.util.Collections;

import com.example.shakethisbottlenoengine.GameInfo;

public class MemorizeFast implements GameInfo {
	
	private long gameDuration;
	private long bonus;
	private long score;
	
	private int next;//the next to add on chooseSequence
	
	private ArrayList<Integer> trueSequence, chooseSequence;
	
	//colors sequence 0-red; 1-yellow; 2-green; 3-blue
	
	//constructor
	public MemorizeFast(){
		this.trueSequence   = new ArrayList<Integer>();
		this.chooseSequence = new ArrayList<Integer>();
		next = 0;
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
	
	public int getNext(){return this.next;}
	
	/**
	 * Build the colors sequence
	 */
	private void buildGameSequence(){
		for(int i = 0;i < 4;i++){ trueSequence.add(i);}
		Collections.shuffle(trueSequence);
	}
	
	/**
	 * Returns true if the game is clear, if the trueSequence and chooseSequence are equal
	 * @return
	 */
	public boolean gameClear(){
		for(int i = 0;i < trueSequence.size();i++){
			if(trueSequence.get(i)!= chooseSequence.get(i)){return false;}
		}
		return true;
	}
	
	/**
	 * Add the chosen color to the chooseSequence
	 * @param color
	 * @return
	 */
	public boolean addColors(int color){
		if(color >=0 && color <= 3){
			if(color==trueSequence.get(next)){
				synchronized (this) {
					chooseSequence.add(color);
					System.out.println("next: "+next);
					next++;
					return true;
				}
			}
		}	
		return false;
	}
	
	public ArrayList<Integer> getSequence(){return trueSequence;}
}

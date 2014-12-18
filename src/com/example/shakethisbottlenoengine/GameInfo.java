package com.example.shakethisbottlenoengine;

/**
 * Created by Igor on 12/12/2014.
 */
public interface GameInfo {
    public enum Dificuldade {
        FACIL, MEDIO, DIFICIL
    }

    public long getGameDuration();

    public long getGameVictoryPoints();

	void setGameDuration(long time);

	void setGameBonus(long bonus);

	void setScorePoints(long points);

	void setDifficulty(int difficulty);

	long getGameBonus();

	long getGameScore();

	int getDifficulty();
}

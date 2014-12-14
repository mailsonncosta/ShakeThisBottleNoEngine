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
}

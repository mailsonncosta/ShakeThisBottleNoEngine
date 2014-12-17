package com.example.shakethisbottlenoengine.main;

/**
 * Some simple operations that a simple game must implement.
 * @author �talo
 *
 */
public interface BaseGame {

	String getName();

	MiniGameType getType();

	Integer getScore();

	Integer getHighScore();

	String getDescription();

}
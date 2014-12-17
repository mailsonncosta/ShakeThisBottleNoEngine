package com.example.shakethisbottlenoengine.main;

/**
 * Some simple operations that a simple game must implement.
 * @author Ítalo
 *
 */
public interface BaseGame {

	String getName();

	MiniGameType getType();

	Integer getScore();

	Integer getHighScore();

	String getDescription();

}
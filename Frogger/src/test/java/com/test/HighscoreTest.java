package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.game.score.Highscore;


/**
 * 
 * Tests {@link com.game.score.Highscore} class.
 * 
 * @author hcywy2
 *
 */
public class HighscoreTest {

	Highscore highscore;

	int arr[] = {20,60,50};

	
	/**
	 * Tests if the highscore list is sorted in descending order.
	 */
	@Test
	public void testSortHighscores() {
		int arr2[] = {60,50,20};
		highscore = new Highscore(); 
		highscore.sortHighscore(arr);
		
		assertArrayEquals(arr2, arr);	
		
	}

	
	/**
	 * Tests if the highscores are written to the file. 
	 */
	@Test
	public void testWriteToFile() {
		int lvl = 1;
		
		Integer hS[] = new Integer[arr.length];
		
		highscore = new Highscore();
		highscore.sortHighscore(arr);
		highscore.writeToFile(lvl);
		System.arraycopy(highscore.getHighScores(), 0, hS, 0, hS.length);
		highscore.readFromFile(lvl);
		
		assertArrayEquals(hS, highscore.getHighScores());	

	}
	
	
	/**
	 * Tests if adding existing score will make no change to the highscore list.
	 */
	@Test
	public void testAddExistingScores() {
		int lvl = 1;
		
		
		highscore = new Highscore();
		
		highscore.sortHighscore(arr);
		
		highscore.writeToFile(lvl);
		
		highscore.addScore(60, lvl);
		highscore.readFromFile(lvl);
		
		assertArrayEquals(arr, highscore.gethighscores());	
	}
	
	
	/**
	 * Tests if a new highscore is added into the highscore list.
	 */
	@Test
	public void testAddScore() {
		int lvl = 1;
		
		int arr1[] = {70,60,50};
		highscore = new Highscore();
		
		highscore.sortHighscore(arr);
		highscore.writeToFile(lvl);
		
		highscore.addScore(70, lvl);
		highscore.readFromFile(lvl);
		
		assertArrayEquals(arr1, highscore.gethighscores());	
	}
	

}



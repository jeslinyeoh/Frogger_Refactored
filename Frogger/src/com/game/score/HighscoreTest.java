package com.game.score;

public class HighscoreTest {

public static void main (String args[]) {
		
	Highscore h = new Highscore();
	
		h.addScore(5);
		h.addScore(6);
		h.addScore(5);
		
		h.writeToFile();
		
		h.readFromFile();
		
		
	}
	
}

package com.game.score;

public class HighscoreTest {

public static void main (String args[]) {
		
	Highscore h = new Highscore();
		
	int n = 1;
	
		//h.readFromFile(n);
		h.addScore(4, n);
		h.addScore(5, n);
		h.addScore(10, n);
		
		h.writeToFile(n);
		
		h.readFromFile(n);
		
	}
	
}

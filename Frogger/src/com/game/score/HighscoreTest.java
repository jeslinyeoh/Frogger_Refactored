package com.game.score;

public class HighscoreTest {

public static void main (String args[]) {
		
	Highscore h = new Highscore();
	
		h.addScore(3);
		h.addScore(1);
		h.addScore(10);
		
		h.writeToFile();
		
		h.readFromFile();
		h.tryPrint();
		
	}
	
}

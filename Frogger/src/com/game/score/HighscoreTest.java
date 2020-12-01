package com.game.score;

public class HighscoreTest {

public static void main (String args[]) {
		
	Highscore h = new Highscore();
		
		h.readFromFile();
		h.addScore(4);
		h.addScore(5);
		h.addScore(10);
		
		h.writeToFile();
		
		h.readFromFile();
		h.tryPrint();
		
	}
	
}

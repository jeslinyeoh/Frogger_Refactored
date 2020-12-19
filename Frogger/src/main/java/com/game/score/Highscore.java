package com.game.score;

import java.io.*;
import java.util.Scanner;

/**
 * 
 * Reads and writes new highscores into their respective files.
 * 
 * @author hcywy2
 *
 */
public class Highscore{
	
	/**
	 * Number of highscores available.
	 */
	private int n = 3;
	
	private int hs[] = new int[n];
	private Integer highScore[];
	
	
	/**
	 * True if current score is a highscore.
	 */
	private boolean isHighscore = false;
	
	/**
	 * True if current score already exists in the highscore list.
	 */
	private boolean exist = false;
	
	
	/**
	 * Reads the current highscores from the file.
	 * @param lvl Current level.
	 */
	public void readFromFile(int lvl) {
		
		int i;
		
		try {
			  Scanner s = new Scanner(new File("Resources/Highscores/highscore"+ lvl +".txt"));
			  int []highs = new int[n];
			  
			  for (i = 0; i < highs.length; i++) {
				  highs[i] = s.nextInt();
			  }
			      
			  for (i = 0; i < highs.length; i++) {

				  
				  hs[i] = highs[i];
				
			  }			  
			 
			  convertInt(hs);
				
	    }
	    
				
		catch (FileNotFoundException fnfe) {
			System.out.println("The specified file not found " + fnfe);
		}
								
		
	}
	
	
	/**
	 * Writes latest highscores to the file.
	 * @param lvl Current level.
	 */
	public void writeToFile(int lvl) {
		
		try {
			FileWriter writer = new FileWriter("Resources/Highscores/highscore"+ lvl +".txt");
			
		      
		     int hslen = highScore.length;
		     for (int i = 0; i < hslen; i++) {
		        writer.write(highScore[i] + "\n"+ "");
		     }
		     
		     writer.close();
		}
		
		
		catch (FileNotFoundException fnfe) {
			System.out.println("The specified file not found " + fnfe);
		}
		
		catch (IOException ioe) {
			System.out.println("IO Exception: " + ioe);
		}
		
		
	     
	}
	
	
	/**
	 * Checks if the current score exist in the file 
	 * and writes to file if it is a highscore. 
	 * This method calls {@link #readFromFile(int)}, {@link #sortHighscore(int[])}
	 * and {@link #writeToFile(int)} 
	 * @param s Current score.
	 * @param lvl Current level.
	 */
	public void addScore(int s, int lvl) {

		int i;
		
		readFromFile(lvl);		
		
		//checks if the current score exist in the existing highscore list
		for(i = 0; i < hs.length; i++) {
	        
	        if(s == hs[i]){
	            exist = true;
	            break;
	        }
	    }
	    
		
		
		for(i = 0; i < hs.length; i++) {
			
			if(s > hs[i] && exist == false) {
				isHighscore = true;
			}
			
			//replaces the last element in the array
			if(isHighscore) {
				hs[hs.length-1] = s; //replaces last element
				isHighscore = false;
				break;
			}
		}
		
		sortHighscore(hs);
		writeToFile(lvl);
		
		
	} //end of addScore()
	
	
	
	/**
	 * Sorts highscores in the descending order.
	 */
	public void sortHighscore(int arr[]) {
		int i, j, temp;
		
		for (i = 0 ; i < arr.length; i++){
	        for (j = 0 ; j < arr.length; j++){
	        	
	        	if(j == arr.length-1) {
	        		continue;
	        	}
	        	
	            if (arr[j] < arr[j+1]){
	                
	            	temp = arr[j];
	            	arr[j] = arr[j+1];
	            	arr[j+1] = temp;
	            	
	            }
	        }
	    } //end for loop
		
		convertInt(arr);
		
	}
	
	
	/**
	 * Converts an int array to an Integer array.
	 */
	public void convertInt(int arr[]) {
		highScore = new Integer[arr.length];
		

		//convert int to Integer
		for(int i = 0; i < arr.length; i++) {
			highScore[i] = Integer.valueOf(arr[i]);
		}
		
	}
		
	
	/**
	 * Gets {@link #highScore}.
	 */
	public Integer[] getHighScores() {
		return highScore;
	}
	
	
	
	/**
	 * Gets {@link #hs}.
	 */
	public int[] gethighscores() {
		return hs;
	}
}

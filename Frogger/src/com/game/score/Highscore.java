package com.game.score;

import java.io.*;
import java.util.Scanner;

public class Highscore {
	
	private int n = 3;
	private int hs[] = new int[n];
	private Integer highScore[];
	
	private boolean isHighscore = false, exist = false;
	
	
	public void readFromFile() {
		
		int i;
		
		try {
			  Scanner s = new Scanner(new File("src/highscore.txt"));
			  int []highs = new int[n];
			  
			  for (i = 0; i < highs.length; i++) {
				  highs[i] = s.nextInt();
			  }
			      
			  for (i = 0; i < highs.length; i++) {
				  
				  if(i == n-1) {
		        	break;
				  }
				  
				  hs[i] = highs[i];
			  }
			  
			  System.out.println("\nread from file\n");
			 
			  convertInt(hs);
				
	    }
	    
				
		catch (FileNotFoundException fnfe) {
			System.out.println("The specified file not found " + fnfe);
		}
				
		catch (IOException ioe) {
			System.out.println("IO Exception: " + ioe);
		}
				
		
	}
	
	
	public void writeToFile() {
		
		try {
			FileWriter writer = new FileWriter("src/highscore.txt");
			
		      
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
	
	
	public void addScore(int s) {
		
		int i;
		
		readFromFile();
		
		//check if new score exist in the existing highscore list
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
			
			//replace the last element in the array
			if(isHighscore) {
				hs[hs.length-1] = s; //replace last element
				isHighscore = false;
				break;
			}
		}
		
		sortHighscore(hs);
		writeToFile();
		
		
	} //end of addScore()
	
	
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
	
	
	public void convertInt(int arr[]) {
		highScore = new Integer[arr.length];
		
		//convert int to Integer
		for(int i = 0; i < arr.length; i++) {
			highScore[i] = Integer.valueOf(arr[i]);
		}
		
	}
		
	public void tryPrint() {
		
		for(int i = 0; i < highScore.length; i++) {
			
			if(highScore[i] == 0) {
				break;
			}
			
			System.out.printf("%d is %d\n", i, highScore[i]);
		}
	}
	
	public Integer[] getHighScores() {
		return highScore;
	}
}

package com.game.score;

import com.game.Frogger;
import com.game.background.Background;
import com.game.background.Digit;

import javafx.animation.AnimationTimer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Score {
	
	private AnimationTimer animTimer;
	private Frogger frogger;
	private Background background;
	private Highscore highscore = new Highscore();
	
	public Score(Frogger frogger, Background background) {
		this.frogger = frogger;
		this.background = background;
		start();
	}
	
	public void createTimer() {
        animTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	if (frogger.getChangeScore()) {
            		setNumber(frogger.getPoints());
            	}
            	
            	if (frogger.getStop()) {
            		highscore.addScore(frogger.getPoints());
            		
            		System.out.print("STOPP:");
            		stop();
            		background.myStage.stop();
            		Alert alert = new Alert(AlertType.INFORMATION);
            		alert.setTitle("You Have Won The Game!");
            		alert.setHeaderText("Your High Score: "+ frogger.getPoints()+"!");
            		alert.setContentText("Highest Possible Score: 800");
            		alert.show();
            	}
            }
        };
    }
	
	
	public void start() {
    	createTimer();
        animTimer.start();
    }

	
    public void stop() {
        animTimer.stop();
    }
    
    public void setNumber(int n) {
    	int shift = 0;
    	while (n > 0) {
    		  int d = n / 10;
    		  int k = n - d * 10;
    		  n = d;
    		  background.myStage.add(new Digit(k, 30, 530 - shift, 25));
    		  shift += 30;
    		}
    }
    
    
}

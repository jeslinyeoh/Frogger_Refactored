package com.game.score;

import com.game.actor.Frogger;
import com.game.background.Background;
import com.game.background.Digit;

import javafx.animation.AnimationTimer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;

public class Score {
	
	private AnimationTimer animTimer;
	private Frogger frogger;
	private Background background;
	private Highscore highscore = new Highscore();
	private PopUpHighscore pophighscore = new PopUpHighscore();
	private long lastUpdate = 0;
	
	public Score(Frogger frogger, Background background) {
		this.frogger = frogger;
		this.background = background;
		start();
		
		VBox layout = new VBox();
		pophighscore.setRanking(layout);
		
	}
	
	public void createTimer() {
        animTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	
            	if(now - lastUpdate >= 50_000_000) {
            		
            		if (frogger.getChangeScore()) {
                		setNumber(frogger.getPoints());
                	}
                	
                	if (frogger.getStop()) {
                		highscore.readFromFile();
                		highscore.addScore(frogger.getPoints());
                		VBox layout = new VBox();
                		pophighscore.setRanking(layout);
                		
                		
                		System.out.print("STOPP:");
                		stop();
                		background.myStage.stop();
     
                		
                		Alert alert = new Alert(AlertType.CONFIRMATION);
                		alert.setTitle("Continue");
                		alert.setHeaderText("Proceed to Next Level?");
                		alert.setContentText("Highest Possible Score: 800");
                		alert.show();
                		
                		PopUpHighscore.display(layout);
                	}
                	
                	lastUpdate = now;
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

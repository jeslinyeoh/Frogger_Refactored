package com.game.score;

import java.io.IOException;

import com.application.Main;
import com.game.background.Background;
import com.game.background.Digit;
import com.game.player.Frogger;

import javafx.animation.AnimationTimer;
import javafx.scene.layout.VBox;

public class Score {
	
	private AnimationTimer animTimer;
	private Frogger frogger;
	private Background background;
	private Highscore highscore = new Highscore();
	private PopUpHighscore popupHighscore;
	private long lastUpdate = 0;

	
	public Score(Frogger frogger, Background background) {
		this.frogger = frogger;
		this.background = background;
		start();
		
		VBox layout = new VBox();
		popupHighscore = new PopUpHighscore(background);
		popupHighscore.setRanking(layout);
		
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
                		highscore.readFromFile(Background.getLevel());
                		highscore.addScore(frogger.getPoints(), Background.getLevel());
                		VBox layout = new VBox();
                		popupHighscore.setRanking(layout);
                		
                		background.myStage.stop();
                		stop();
                	
                		popupHighscore.display(layout);
                		
                		try {
                			background.checkNextLevel();
                		}
                		
                		catch (Exception e) {
							e.printStackTrace();
						}
                		
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
    	
    	if (n == 0) {
			  background.myStage.add(new Digit(0, 30, 530-30, 25));
		}
    	
    	while (n > 0) {
    		
    		int d = n / 10;
    		int k = n - d * 10;
    		n = d;
    		  
    		if(n < 100) {
    			background.myStage.add(new Digit(0, 30, 530-60, 25));
    			  
    		}
    		  
    		  background.myStage.add(new Digit(k, 30, 530 - shift, 25));
    		  shift += 30;
    	}
    }
    
    
    public PopUpHighscore getPopUpHighscore() {
    	return popupHighscore;
    }
    
    
}

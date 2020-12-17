package com.game.score;

import com.game.background.Background;
import com.game.background.Digit;
import com.game.player.Frogger;

import javafx.animation.AnimationTimer;
import javafx.scene.layout.VBox;

/**
 * Ensures real time score update during the game.
 * @author hcywy2
 *
 */
public class Score {
	
	private AnimationTimer animTimer;
	private Frogger frogger;
	private Background background;
	private Highscore highscore = new Highscore();
	private PopUpHighscore popupHighscore;
	
	/**
     * Conditions the refresh rate of the AnimationTimer.
     */
	private long lastUpdate = 0;

	
	/**
	 * Initialises classes, starts the AnimationTimer and 
	 * calls {@link com.game.score.PopUpHighscore#setRanking(VBox)}. 
	 */
	public Score(Frogger frogger, Background background) {
		this.frogger = frogger;
		this.background = background;
		start();
		
		VBox layout = new VBox();
		popupHighscore = new PopUpHighscore(background);
		popupHighscore.setRanking(layout);
		
	}
	
	
	/**
	 * Displays Pop-Up Highscore window and 
	 * calls {@link com.game.background.Background#checkNextLevel()}.
	 * Conditions were added to slow down the refresh rate of the AnimationTimer.
	 * 
	 * @see com.game.score.Highscore
	 * @see com.game.score.PopUpHighscore
	 */
	public void createTimer() {
		
        animTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	
            	if(now - lastUpdate >= 50_000_000) {
            		
            		if (frogger.getChangeScore()) {
                		setNumber(frogger.getPoints());
                	}
                	
                	if (frogger.getStop()) {
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
	
	
	/**
	 * Creates and starts AnimationTimer.
	 */
 	public void start() {
    	createTimer();
        animTimer.start();
    }

	
 	/**
 	 * Stops AnimationTimer.
 	 */
    public void stop() {
        animTimer.stop();
    }
    
    
    /**
     * Displays the real time score in the game.
     * @param n Current score.
     */
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
    
    
    /**
     * Gets this.{@link com.game.score.PopUpHighscore} object.
     */
    public PopUpHighscore getPopUpHighscore() {
    	return popupHighscore;
    }
    
    
}

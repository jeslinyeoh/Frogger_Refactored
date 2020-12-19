package com.game.background;

import java.io.File;

import com.application.Actor;
import com.game.player.Frogger;

import javafx.animation.AnimationTimer;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * 
 * Loads, plays and stops music.
 * 
 * @author hcywy2
 *
 */
public class Music extends Actor {
	
	private Frogger frogger;
	private AnimationTimer animTimer;
	private MediaPlayer mediaPlayer;
	
	/**
     * Conditions the refresh rate of the AnimationTimer.
     */
	private long lastUpdate = 0;
	
	/**
	 * Initialises {@link com.game.player.Frogger} object.
	 */
	public Music(Frogger frogger) {
		this.frogger = frogger;
	}
	
	
	/**
	 * Plays music and calls {@link #createStopMusicTimer()}. 
	 */
	public void startMusic() {
		playMusic();
		createStopMusicTimer();
		animTimer.start();
	}
	
	
	/**
	 * Initialises a AnimationTimer to stop music when the level is cleared.
	 * Conditions were added to slow down the refresh rate of the AnimationTimer.
	 * @see com.game.player.Frogger#getStop()
	 */
	public void createStopMusicTimer() {
		
		animTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
            	
            	if(now - lastUpdate >= 50_000_000) {
            		if (frogger.getStop()) {
            			stopMusic();
            		}
            		
            		lastUpdate = now;
            	}
            	
            }
		};
	}
	
	
	/**
	 * Loads music from file and plays it indefinitely.
	 */
	public void playMusic() {
		
		String musicFile = "Resources/Music/Frogger Main Song Theme (loop).mp3";   
		Media sound = new Media(new File(musicFile).toURI().toString());
		
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	    
	}
	
	
	/**
	 * Stops music.
	 */
	public void stopMusic() {
		mediaPlayer.stop();
	}

	
	/**
	 * Unused.
	 */
	@Override
	public void act(long now) {
	}
	
	
	
}

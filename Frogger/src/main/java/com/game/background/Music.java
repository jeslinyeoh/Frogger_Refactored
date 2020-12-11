package com.game.background;

import java.io.File;

import com.application.Actor;
import com.game.player.Frogger;

import javafx.animation.AnimationTimer;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Music extends Actor {
	
	private Frogger frogger;
	private AnimationTimer animTimer;
	private MediaPlayer mediaPlayer;

	private long lastUpdate = 0;
	
	public Music(Frogger frogger) {
		this.frogger = frogger;
	}
	
	public void startMusic() {
		playMusic();
		createStopMusicTimer();
		animTimer.start();
	}
	
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
	
	@Override
	public void act(long now) {
	}
	
	public void playMusic() {
		
		String musicFile = "Resources/Music/Frogger Main Song Theme (loop).mp3";   
		Media sound = new Media(new File(musicFile).toURI().toString());
		
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	    
	}
	
	public void stopMusic() {
		mediaPlayer.stop();
	}

	
}

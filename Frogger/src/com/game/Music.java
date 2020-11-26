package com.game;

import java.io.File;

import com.application.Actor;
import com.game.background.Background;

import javafx.animation.AnimationTimer;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Music extends Actor {
	
	Frogger frogger;
	AnimationTimer animTimer;
	MediaPlayer mediaPlayer;
	
	public Music(Frogger frogger) {
		this.frogger = frogger;
		startMusic();
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
            	if (frogger.getStop()) {
        			stopMusic();
        		}
            }
		};
	}
	
	@Override
	public void act(long now) {
	}
	
	public void playMusic() {
		
		String musicFile = "Music/Frogger Main Song Theme (loop).mp3";   
		Media sound = new Media(new File(musicFile).toURI().toString());
		
		mediaPlayer = new MediaPlayer(sound);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
	    mediaPlayer.play();
	    
	}
	
	public void stopMusic() {
		mediaPlayer.stop();
	}

	
}

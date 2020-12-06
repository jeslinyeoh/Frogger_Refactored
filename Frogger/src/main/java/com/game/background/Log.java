package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

public class Log extends Actor {
	
	private double speed;
	
	@Override
	public void act(long now) {
		
		move(speed , 0);
		
		if (getX() > 600 && speed > 0) {
			setX(-180);
		}
		
		else if (getX() < -300 && speed < 0) {
			setX(700);
		}
			
	}
	
	
	public Log(String imageLink, int xpos, int ypos, double s, int size) {
		
		setImage(new Image(imageLink, size,size, true, true));
		setX(xpos);
		setY(ypos);
		
		speed = s;
		
	}
	
	
	public boolean getLeft() {
		return speed < 0;
	}
}

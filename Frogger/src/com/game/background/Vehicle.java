package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

public class Vehicle extends Actor {
	private double speed;
	@Override
	public void act(long now) {
		
		move(speed , 0);
		
		if (getX() > 600 && speed > 0) {
			setX(-200);
		}
			
		else if (getX() < -50 && speed < 0) {
			setX(600);
		}
			
	}
	
	
	public Vehicle(String imageLink, int xpos, int ypos, double s, int w, int h) {
		
		setImage(new Image(imageLink, w,h, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
		
	}

}
package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

/**
 * 
 * Renders movable vehicle images in the game. 
 *
 */
public class Vehicle extends Actor {
	private double speed;
	
	/**
	 * Initialises the log's image.
	 * @param imageLink File path of the image used.
	 * @param xpos x-position of the image.
	 * @param ypos y-position of the image.
	 * @param s Speed of the image.
	 * @param w Width of the image.
	 * @param h Height of the image. 
	 */
	public Vehicle(String imageLink, int xpos, int ypos, double s, int w, int h) {
		
		setImage(new Image(imageLink, w,h, true, true));
		setX(xpos);
		setY(ypos);
		speed = s;
		
	}
	
	
	/**
	 * Continuously moves the vehicle in the horizontal direction. 
	 */
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
	
	
	

}

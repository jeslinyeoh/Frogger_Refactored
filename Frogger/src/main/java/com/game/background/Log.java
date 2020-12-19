package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

/**
 * 
 * Renders movable log images in the game. 
 * 
 * @author hcywy2
 *
 */
public class Log extends Actor {
	
	private double speed;
	
	
	/**
	 * Initialises the log's image.
	 * @param imageLink File path of the image used.
	 * @param xpos x-position of the image.
	 * @param ypos y-position of the image.
	 * @param s Speed of the image.
	 * @param dim x and y dimensions of the image.
	 */
	public Log(String imageLink, int xpos, int ypos, double s, int dim) {
		
		setImage(new Image(imageLink, dim, dim, true, true));
		setX(xpos);
		setY(ypos);
		
		speed = s;
		
	}
	
	
	/**
	 * Continuously moves the log in the horizontal direction. 
	 */
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
	
	
	/**
	 * Checks if the log is moving to the left.
	 */
	public boolean getLeft() {
		return speed < 0;
	}
}

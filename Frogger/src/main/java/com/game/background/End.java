package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

/**
 * 
 * Renders the end point's images that will hold Frogger when it reaches.
 * 
 * @author hcywy2
 *
 */
public class End extends Actor{
	
	private boolean activated = false;
	
	/**
	 * Initialises the end point's image.      
	 * @param x x-position of the image.
	 * @param y y-position of the image.
	 */
	public End(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:Resources/Images/End.png", 60, 60, true, true));
	}
	
	
	/**
	 * Change the end point's image.
	 */
	public void setEnd() {
		setImage(new Image("file:Resources/Images/FrogEnd.png", 60, 60, true, true));
		activated = true;
	}
	
	
	/**
	 * Checks if the end point's image has been changed.
	 */
	public boolean isActivated() {
		return activated;
	}
	
	
	/**
	 * Unused.
	 */
	@Override
	public void act(long now) {}
	
	

}

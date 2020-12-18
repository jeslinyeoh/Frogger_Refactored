package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

/**
 * Initialises turtle's properties.
 * @author hcywy2
 *
 */
public class Turtle extends Actor{
	Image turtle1, turtle2, turtle3, turtle4;
	Image turtle1b, turtle1c;
	double speed;
	boolean sunk = false;
	
	public Turtle() {}
	
	
	/**
	 * Initialises all the turtle images.
	 * @param xpos x-position of the image.
	 * @param ypos y-position of the image.
	 * @param s Speed of the image.
	 * @param w Width of the image.
	 * @param h Height of the image.
	 */
	public Turtle(int xpos, int ypos, double s, int w, int h) {
		
		turtle1 = new Image("file:Resources/Images/TurtleAnimation1.png", w, h, true, true);
		turtle1b = new Image("file:Resources/Images/TurtleAnimation2.png", w, h, true, true);
		turtle1c = new Image("file:Resources/Images/TurtleAnimation3.png", w, h, true, true);
		
		turtle2 = new Image("file:Resources/Images/TurtleAnimation2Wet.png", w, h, true, true);
		turtle3 = new Image("file:Resources/Images/TurtleAnimation3Wet.png", w, h, true, true);
		turtle4 = new Image("file:Resources/Images/TurtleAnimation4Wet.png", w, h, true, true);
		
		setX(xpos);
		setY(ypos);
		speed = s;
		setImage(turtle2);
	}
	
	
	/**
	 * Checks if the turtle is sunk.
	 */
	public boolean isSunk() {
		return sunk;
	}
	
	
	/**
	 * Checks if the log is moving to the left.
	 */
	public boolean getLeft() {
		return speed < 0;
	}
	
	
	/**
	 * To be overwritten by child classes.
	 */
	@Override
	public void act(long now) {	} 
	
}
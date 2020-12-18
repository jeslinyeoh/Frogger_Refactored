package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

/**
 * Renders the digit images which reflects the player's score.
 */
public class Digit extends Actor{
	private Image im1;
	
	/**
	 * Initialises the image of the current object. 
	 * @param n Number(0-9) used to call the corresponding image.
	 * @param dim x and y dimensions of the image.
	 * @param x x-position of the image.
	 * @param y y-position of the image.
	 */
	public Digit(int n, int dim, int x, int y) {
		im1 = new Image("file:Resources/Images/"+n+".png", dim, dim, true, true);
		setImage(im1);
		setX(x);
		setY(y);
	}
	
	
	/**
	 * Unused.
	 */
	@Override
	public void act(long now) {	}
	
	
	
}

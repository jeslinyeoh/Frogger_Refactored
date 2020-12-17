package com.game.player;

import com.application.Actor;

import javafx.scene.image.Image;

/**
 * Initialises Frogger's properties and all the images of Frogger's movement.
 * @author hcywy2
 *
 */
public class FroggerProperties extends Actor{
	
	final int imgSize = 40;
	final double moveY = 26.66;
	final double moveX = 21.32;
	
	final Image imgW1 = new Image("file:Resources/Images/froggerUp.png", imgSize, imgSize, true, true);
	final Image imgA1 = new Image("file:Resources/Images/froggerLeft.png", imgSize, imgSize, true, true);
	final Image imgS1 = new Image("file:Resources/Images/froggerDown.png", imgSize, imgSize, true, true);
	final Image imgD1 = new Image("file:Resources/Images/froggerRight.png", imgSize, imgSize, true, true);
	final Image imgW2 = new Image("file:Resources/Images/froggerUpJump.png", imgSize, imgSize, true, true);
	final Image imgA2 = new Image("file:Resources/Images/froggerLeftJump.png", imgSize, imgSize, true, true);
	final Image imgS2 = new Image("file:Resources/Images/froggerDownJump.png", imgSize, imgSize, true, true);
	final Image imgD2 = new Image("file:Resources/Images/froggerRightJump.png", imgSize, imgSize, true, true);
	
	
	/**
	 * Unused.
	 */
	@Override
	public void act(long now) {}

}


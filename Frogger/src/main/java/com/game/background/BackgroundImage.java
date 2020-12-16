package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

/**
 * 
 * Sets the background image.
 *
 */
public class BackgroundImage extends Actor{

	/**
	 * Unused.
	 */
	@Override
	public void act(long now) {	}
	
	/**
	 * This method sets some of the background image's properties.
	 * @param imageLink File path of the image used.
	 */
	public BackgroundImage(String imageLink) {
		setImage(new Image(imageLink, 565, 800, true, true));	
	}

}

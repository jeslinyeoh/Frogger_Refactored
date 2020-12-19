package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

/**
 * 
 * Sets the background image.
 * 
 * @author hcywy2
 *
 */
public class BackgroundImage extends Actor{

	
	/**
	 * Sets some of the background image's properties.
	 * @param imageLink File path of the image used.
	 */
	public BackgroundImage(String imageLink) {
		setImage(new Image(imageLink, 565, 800, true, true));	
	}
	
	
	/**
	 * Unused.
	 */
	@Override
	public void act(long now) {	}
	

}

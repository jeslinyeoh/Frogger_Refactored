package com.game.player;

import com.application.Actor;

import javafx.scene.image.Image;

public class FroggerProperties extends Actor{
	
	final int imgSize = 40;
	final double moveY = 26.66;
	final double moveX = 21.32;
	
	Image imgW1 = new Image("file:Images/froggerUp.png", imgSize, imgSize, true, true);
	Image imgA1 = new Image("file:Images/froggerLeft.png", imgSize, imgSize, true, true);
	Image imgS1 = new Image("file:Images/froggerDown.png", imgSize, imgSize, true, true);
	Image imgD1 = new Image("file:Images/froggerRight.png", imgSize, imgSize, true, true);
	Image imgW2 = new Image("file:Images/froggerUpJump.png", imgSize, imgSize, true, true);
	Image imgA2 = new Image("file:Images/froggerLeftJump.png", imgSize, imgSize, true, true);
	Image imgS2 = new Image("file:Images/froggerDownJump.png", imgSize, imgSize, true, true);
	Image imgD2 = new Image("file:Images/froggerRightJump.png", imgSize, imgSize, true, true);
	
	@Override
	public void act(long now) {}

}


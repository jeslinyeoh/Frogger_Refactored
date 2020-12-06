package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

public class Digit extends Actor{
	private int dim;
	private Image im1;
	
	@Override
	public void act(long now) {	}
	
	public Digit(int n, int dim, int x, int y) {
		im1 = new Image("file:Images/"+n+".png", dim, dim, true, true);
		setImage(im1);
		setX(x);
		setY(y);
	}
	
}

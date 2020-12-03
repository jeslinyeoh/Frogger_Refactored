package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

public class End extends Actor{
	boolean activated = false;
	@Override
	public void act(long now) {
	}
	 
	public End(int x, int y) {
		setX(x);
		setY(y);
		setImage(new Image("file:Images/End.png", 60, 60, true, true));
	}
	
	public void setEnd() {
		setImage(new Image("file:Images/FrogEnd.png", 60, 60, true, true));
		activated = true;
	}
	
	public boolean isActivated() {
		return activated;
	}
	

}

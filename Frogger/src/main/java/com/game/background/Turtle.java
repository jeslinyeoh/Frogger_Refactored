package com.game.background;

import com.application.Actor;

import javafx.scene.image.Image;

public class Turtle extends Actor{
	Image turtle1, turtle2, turtle3, turtle4;
	Image turtle1b, turtle1c;
	double speed;
	int i = 1;
	boolean bool = true;
	boolean sunk = false;
	
	public Turtle() {}
	
	public Turtle(int xpos, int ypos, double s, int w, int h) {
		
		turtle1 = new Image("file:Images/TurtleAnimation1.png", w, h, true, true);
		turtle1b = new Image("file:Images/TurtleAnimation2.png", w, h, true, true);
		turtle1c = new Image("file:Images/TurtleAnimation3.png", w, h, true, true);
		
		turtle2 = new Image("file:Images/TurtleAnimation2Wet.png", w, h, true, true);
		turtle3 = new Image("file:Images/TurtleAnimation3Wet.png", w, h, true, true);
		turtle4 = new Image("file:Images/TurtleAnimation4Wet.png", w, h, true, true);
		
		setX(xpos);
		setY(ypos);
		speed = s;
		setImage(turtle2);
	}
	
	
	@Override
	public void act(long now) {	} // end of act()
	
	
	public boolean isSunk() {
		return sunk;
	}
	
	public boolean getLeft() {
		return speed < 0;
	}
}
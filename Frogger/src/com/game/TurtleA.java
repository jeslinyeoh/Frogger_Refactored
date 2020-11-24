package com.game;

import com.application.Actor;

import javafx.scene.image.Image;

public class TurtleA extends Actor{
	Image turtle1a, turtle1b, turtle1c;
	Image turtle2, turtle3, turtle4;
	private int speed;
	int i = 1;
	boolean bool = true;
	boolean sunk = false;
	
	
	public TurtleA(int xpos, int ypos, int s, int w, int h) {
		
		turtle1a = new Image("file:Images/TurtleAnimation1.png", w, h, true, true);
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
	public void act(long now) {
		
		int turn = (int) (now/900000000 % 6);
		
		switch(turn) {
			
			case 0:
				setImage(turtle2);
				sunk = false;
				break;
				
			case 1: 
				setImage(turtle1a);
				sunk = false;
				break;
				
			case 2: 
				setImage(turtle1b);
				sunk = false;
				break;
				
			case 3: 
				setImage(turtle1c);
				sunk = false;
				break;
				
			case 4:
				setImage(turtle3);
				sunk = false;
				break;
				
			case 5: 
				setImage(turtle4);
				sunk = true;
				break;
		}			
			
		move(speed , 0);
		
		if (getX() > 600 && speed > 0) {
			setX(-200);
		}
			
		else if (getX() < -75 && speed < 0) {
			setX(600);
		}
			
	} // end of act()
	
	
	public boolean isSunk() {
		return sunk;
	}
}

package com.game.background;


public class TurtleB extends Turtle{
	
	public TurtleB(int xpos, int ypos, double s, int w, int h) {
		
		super(xpos, ypos, s, w, h);
		
		setImage(turtle2);
	}
	
	
	@Override
	public void act(long now) {
		
		int turn = (int) (now/900000000 % 4);
		
		switch(turn) {
			
			case 0:
				setImage(turtle2);
				sunk = false;
				break;
				
			case 1: 
				setImage(turtle1);
				sunk = false;
				break;
				
			case 2:
				setImage(turtle3);
				sunk = false;
				break;
				
			case 3: 
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
	
}

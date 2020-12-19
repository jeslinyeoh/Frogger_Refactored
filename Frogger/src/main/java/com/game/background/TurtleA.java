package com.game.background;

/**
 * 
 * Renders movable turtle images in the game.
 * 
 * @author hcywy2
 *
 */
public class TurtleA extends Turtle{
	
	/**
	 * Initialises the initial turtle image.
	 * @param xpos x-position of the image.
	 * @param ypos y-position of the image.
	 * @param s Speed of the image.
	 * @param w Width of the image.
	 * @param h Height of the image.
	 */
	public TurtleA(int xpos, int ypos, double s, int w, int h) {
		
		super(xpos, ypos, s, w, h);
		
		setImage(turtle2);
	}
	
	
	/**
	 * Continuously switches image and moves the turtle in the horizontal direction. 
	 *  More images to switch to as compared to {@link com.game.background.TurtleB}.
	 */
	@Override
	public void act(long now) {
		
		int turn = (int) (now/900000000 % 6);
		
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
	
}

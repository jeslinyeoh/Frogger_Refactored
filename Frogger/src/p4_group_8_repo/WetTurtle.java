package p4_group_8_repo;

import javafx.scene.image.Image;

public class WetTurtle extends Actor{
	Image turtle1;
	Image turtle2;
	Image turtle3;
	Image turtle4;
	private int speed;
	int i = 1;
	boolean bool = true;
	boolean sunk = false;
	
	
	public WetTurtle(int xpos, int ypos, int s, int w, int h) {
		
		turtle1 = new Image("file:Images/TurtleAnimation1.png", w, h, true, true);
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
		
		int turn = (int) now/900000000  % 4;
		
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
	
	
	public boolean isSunk() {
		return sunk;
	}
}

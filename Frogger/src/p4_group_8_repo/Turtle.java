package p4_group_8_repo;

import javafx.scene.image.Image;

public class Turtle extends Actor{
	Image turtle1;
	Image turtle2;
	Image turtle3;
	private int speed;
	int i = 1;
	boolean bool = true;
	
	
	public Turtle(int xpos, int ypos, int s, int w, int h) {
		
		turtle1 = new Image("file:Images/TurtleAnimation1.png", w, h, true, true);
		turtle2 = new Image("file:Images/TurtleAnimation2.png", w, h, true, true);
		turtle3 = new Image("file:Images/TurtleAnimation3.png", w, h, true, true);
		
		setX(xpos);
		setY(ypos);
		speed = s;
		setImage(turtle2);
	}
	
	
	@Override
	public void act(long now) {
		
		int turn = (int) now/900000000  % 3;
		
		switch(turn) {
		
			case 0:  setImage(turtle2);
				break;
				
			case 1: setImage(turtle1);
				break;
				
			case 2: setImage(turtle3);
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

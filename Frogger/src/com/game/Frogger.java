package com.game;

import java.util.ArrayList;

import com.application.Actor;
import com.game.background.End;
import com.game.*;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;

import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class Frogger extends Actor {
	Image imgW1, imgW2;
	Image imgA1, imgA2;
	Image imgS1, imgS2;
	Image imgD1, imgD2;
	int points = 0;
	int end = 0;
	boolean noMove = false;
	double moveY = 13.3333333*2;
	double moveX = 10.666666*2;
	int imgSize = 40;
	boolean carDeath = false;
	boolean waterDeath = false;
	boolean stop = false;
	
	private boolean changeScore = false;
	int carD = 0;
	private double w = 800;
	ArrayList<End> inter = new ArrayList<End>();
	AnimationTimer animTimer;
	Movement mv;

	
	public Frogger() {

		setImage(new Image("file:Images/froggerUp.png", imgSize, imgSize, true, true));
		setX(280);
		setY(679.8+ moveY);
		imgW1 = new Image("file:Images/froggerUp.png", imgSize, imgSize, true, true);
		imgA1 = new Image("file:Images/froggerLeft.png", imgSize, imgSize, true, true);
		imgS1 = new Image("file:Images/froggerDown.png", imgSize, imgSize, true, true);
		imgD1 = new Image("file:Images/froggerRight.png", imgSize, imgSize, true, true);
		imgW2 = new Image("file:Images/froggerUpJump.png", imgSize, imgSize, true, true);
		imgA2 = new Image("file:Images/froggerLeftJump.png", imgSize, imgSize, true, true);
		imgS2 = new Image("file:Images/froggerDownJump.png", imgSize, imgSize, true, true);
		imgD2 = new Image("file:Images/froggerRightJump.png", imgSize, imgSize, true, true);
		
		startCheckMovement();
		
	} // end of constructor
	
	
	public void startCheckMovement() {
		createCheckMovementTimer();
		animTimer.start();
	}
	
	
	public void createCheckMovementTimer() {
		mv = new Movement(this);
		animTimer = new AnimationTimer() {
            
			@Override
            public void handle(long now) {
				
				if(!getStop()) {
					checkKeyEntered();
				}
				
		
            }
		};
	}
	
	
	public void checkKeyEntered() {
		setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event){
				mv.handleKeyPressed(event);

			}
		});
		
		setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				mv.handleKeyReleased(event);
			}
		});
	}
	
	@Override
	public void act(long now) {
		
		int bounds = 0;
		
		if (getY() < 0 || getY() > 734) {
			setX(300);
			setY(679.8 + moveY);
		}
		
		if (getX() < 0) {
			move(moveY*2, 0);
		}
		
		if (carDeath) {
			
			noMove = true;
			
			if (now % 11 == 0) {
				carD++;
			}
			
			switch (carD) {
				
				case 1: setImage(new Image("file:Images/cardeath1.png", imgSize, imgSize, true, true));
					break;
					
				case 2: setImage(new Image("file:Images/cardeath2.png", imgSize, imgSize, true, true));
					break;
					
				case 3: setImage(new Image("file:Images/cardeath3.png", imgSize, imgSize, true, true));
					break;
					
				case 4: 
					setX(300);
					setY(679.8 + moveY);
					carDeath = false;
					carD = 0;
					setImage(new Image("file:Images/froggerUp.png", imgSize, imgSize, true, true));
					noMove = false;
					
					if (points>50) {
						points-=50;
						changeScore = true;
					}
					break;
					
			} //end of switch
				
		} // end of if
		
		if (waterDeath) {
			
			noMove = true;
			
			if ((now)% 11 ==0) {
				carD++;
			}
			
			switch(carD) {
				
			case 1: setImage(new Image("file:Images/waterdeath1.png", imgSize,imgSize , true, true));
				break;
				
			case 2: setImage(new Image("file:Images/waterdeath2.png", imgSize,imgSize , true, true));
				break;
				
			case 3: setImage(new Image("file:Images/waterdeath3.png", imgSize,imgSize , true, true));
				break;
				
			case 4: setImage(new Image("file:Images/waterdeath4.png", imgSize,imgSize , true, true));
				break;
				
			case 5: 
				setX(300);
				setY(679.8 + moveY);
				waterDeath = false;
				carD = 0;
				setImage(new Image("file:Images/froggerUp.png", imgSize, imgSize, true, true));
				noMove = false;
				
				if (points > 50) {
					points -= 50;
					changeScore = true;
				}
				
				break;
			
			} // end of switch
			
		}
		
		if (getX() > 530) {
			move(-moveY*2, 0);
		}
		
		if (getX() == 240 && getY() == 82) {
			stop = true;
		}
		
		boolean intersectVehicle = (getIntersectingObjects(Vehicle.class).size() >= 1)? true: false;
		boolean intersectLog = (getIntersectingObjects(Log.class).size() >= 1)? true: false;
		boolean intersectTurtleA = (getIntersectingObjects(TurtleA.class).size() >= 1)? true: false;
		boolean intersectTurtleB = (getIntersectingObjects(TurtleB.class).size() >= 1)? true: false;
		boolean intersectEnd = (getIntersectingObjects(End.class).size() >= 1)? true: false;
		
		
		if (intersectVehicle) {
			carDeath = true;
		}
		
		
		if (intersectLog && !noMove) {
			
			if(getIntersectingObjects(Log.class).get(0).getLeft())
				move(-2,0);
			else
				move (.75,0);
		}
		
		
		else if (intersectTurtleA) {
			
			if (getIntersectingObjects(TurtleA.class).get(0).isSunk()) {
				waterDeath = true;
			} 
			
			else {
				move(-1,0);
			}
		}
		
		
		else if (intersectTurtleB) {
			
			if (getIntersectingObjects(TurtleB.class).get(0).isSunk()) {
				waterDeath = true;
			} 
			
			else {
				move(-1,0);
			}
		}
		
		else if (getIntersectingObjects(End.class).size() >= 1) {
			inter = (ArrayList<End>) getIntersectingObjects(End.class);
			
			if (getIntersectingObjects(End.class).get(0).isActivated()) {
				end--;
				points -= 50;
			}
			points += 50;
			changeScore = true;
			w = 800;
			getIntersectingObjects(End.class).get(0).setEnd();
			end++;
			setX(300);
			setY(679.8 + moveY);
		}
		
		else if (getY() < 413){
			waterDeath = true;
			//setX(300);
			//setY(679.8+movement);
		}
	}
	
	public void setChangeScore(boolean bool) {
		changeScore = bool;
	}
	
	public boolean getChangeScore() {
		return changeScore;
	}
	
	public void addPoints() {
		points += 10;
	}
	
	public void setW(double w) {
		this.w = w;
	}
	
	public double getW() {
		return w;
	}
	
	public boolean getStop() {
		return end == 5;
	}
	
	
	public int getPoints() {
		return points;
	}
	

}
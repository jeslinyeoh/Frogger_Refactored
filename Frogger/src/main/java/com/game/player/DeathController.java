package com.game.player;


import com.game.background.End;
import com.game.background.Log;
import com.game.background.TurtleA;
import com.game.background.TurtleB;
import com.game.background.Vehicle;

import javafx.scene.image.Image;

public class DeathController extends FroggerProperties{
	
	private Frogger frogger;
	
	private boolean intersectVehicle;
	private boolean intersectLog;
	private boolean intersectTurtleA;
	private boolean intersectTurtleB;
	private boolean intersectEnd;
	
	private int deathAnim = 0;

	
	public DeathController(Frogger frogger) {
		this.frogger = frogger;
		
		
	}
	
	@Override
	public void act(long now) {}
	
	public void handleDeath(long now) {
		
		if (frogger.getCarDeath()) {
			
			frogger.setNoMove(true);
			
			if (now % 7 == 0) {
				deathAnim++;
			}
			
			switch (deathAnim) {
			
			case 0: setFrogImage(new Image("file:Resources/Images/cardeath1.png", imgSize, imgSize, true, true));
				break;
				
			case 1: setFrogImage(new Image("file:Resources/Images/cardeath2.png", imgSize, imgSize, true, true));
				break;
				
			case 2: setFrogImage(new Image("file:Resources/Images/cardeath3.png", imgSize, imgSize, true, true));
				break;
				
			case 3: 
				frogger.setX(270);
				frogger.setY(679.8 + moveY);
				frogger.setCarDeath(false);
				deathAnim = 0;
				setFrogImage(new Image("file:Resources/Images/froggerUp.png", imgSize, imgSize, true, true));
				frogger.setNoMove(false);
				

				frogger.minusPoints();
				frogger.setChangeScore(true);
				
				break;
			}
			
		} // end of if
		
		if (frogger.getWaterDeath()) {
			
			frogger.setNoMove(true);
			
			if (now % 7 == 0) {
				deathAnim++;
			}
			
			switch(deathAnim) {
			
			case 0: setFrogImage(new Image("file:Resources/Images/waterdeath1.png", imgSize,imgSize , true, true));
				break;
				
			case 1: setFrogImage(new Image("file:Resources/Images/waterdeath2.png", imgSize,imgSize , true, true));
				break;
				
			case 2: setFrogImage(new Image("file:Resources/Images/waterdeath3.png", imgSize,imgSize , true, true));
				break;
				
			case 3: setFrogImage(new Image("file:Resources/Images/waterdeath4.png", imgSize,imgSize , true, true));
				break;
				
			case 5: 
				frogger.setX(270);
				frogger.setY(679.8 + moveY);
				frogger.setWaterDeath(false);
				deathAnim = 0;
				setFrogImage(new Image("file:Resources/Images/froggerUp.png", imgSize, imgSize, true, true));
				frogger.setNoMove(false);
				
				frogger.minusPoints();
				frogger.setChangeScore(true);
				
				break;
			
			} // end of switch
		} // end of if
		
		
	} // end of act()
	
	public void checkDeath() {
		intersectVehicle = (frogger.getIntersectingObjects(Vehicle.class).size() >= 1)? true: false;
		intersectLog = (frogger.getIntersectingObjects(Log.class).size() >= 1)? true: false;
		intersectTurtleA = (frogger.getIntersectingObjects(TurtleA.class).size() >= 1)? true: false;
		intersectTurtleB = (frogger.getIntersectingObjects(TurtleB.class).size() >= 1)? true: false;
		intersectEnd = (frogger.getIntersectingObjects(End.class).size() >= 1)? true: false;
		
		if (intersectVehicle) {
			frogger.setCarDeath(true);
		}
		
		
		if (intersectLog && !frogger.getNoMove()) {
			
			if(frogger.getIntersectingObjects(Log.class).get(0).getLeft())
				frogger.move(-2,0);
			else
				frogger.move (1,0);
		}
		
		
		else if (intersectTurtleA) {
			
			if (frogger.getIntersectingObjects(TurtleA.class).get(0).isSunk()) {
				frogger.setWaterDeath(true);
			} 
			
			else {
				
				if(frogger.getIntersectingObjects(TurtleA.class).get(0).getLeft()) {
					frogger.move(-1,0);
				}

				
				else {
					frogger.move(2,0);				
				}

			}
		}
		
		
		else if (intersectTurtleB) {
			
			if (frogger.getIntersectingObjects(TurtleB.class).get(0).isSunk()) {
				frogger.setWaterDeath(true);
			} 
			
			else {
				
				if(frogger.getIntersectingObjects(TurtleB.class).get(0).getLeft()) {
					frogger.move(-1,0);
				}

				
				else {
					frogger.move(2,0);				
				}

			}
		}
		
		else if (intersectEnd) {
			
			if (frogger.getIntersectingObjects(End.class).get(0).isActivated()) {
				frogger.minusEnd();
				frogger.minusPoints();
			}
			
			
			frogger.addPoints(50);
			frogger.setChangeScore(true);
			frogger.setW(800);
			frogger.getIntersectingObjects(End.class).get(0).setEnd();
			
			frogger.addEnd();
			frogger.addEnd();
			frogger.addEnd();
			frogger.addEnd();
			frogger.addEnd();
			
			frogger.setX(270);
			frogger.setY(679.8 + moveY);
			
			
		}
		
		else if (frogger.getY() < 413){
			frogger.setWaterDeath(true);
		}
	}
	
	
	public void setFrogImage(Image image) {
		frogger.setImage(image);
	}
	
	

}

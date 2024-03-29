package com.game.player;


import com.game.background.End;
import com.game.background.Log;
import com.game.background.TurtleA;
import com.game.background.TurtleB;
import com.game.background.Vehicle;

import javafx.scene.image.Image;

/**
 * 
 * Checks and handles Frogger's death.
 * 
 * @author hcywy2
 *
 */
public class DeathController extends FroggerProperties{
	
	private Frogger frogger;
	
	private boolean intersectVehicle;
	private boolean intersectLog;
	private boolean intersectTurtleA;
	private boolean intersectTurtleB;
	private boolean intersectEnd;
	
	/**
	 * Keeps track of the current death image.
	 */
	private int deathAnim = 0;

	
	/**
	 * Initialises this.{@link com.game.player.Frogger} object.
	 */
	public DeathController(Frogger frogger) {
		this.frogger = frogger;
	}
	
	
	/**
	 * Handles the death animation when the Frogger dies.
	 * @see com.game.player.Frogger#act(long)
	 * @param now The timestamp of the current frame given in nanoseconds.
	 */
	public void handleDeath(long now) {
		
		if (frogger.carDeath) {
			
			frogger.noMove = true;
			
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
				frogger.carDeath = false;
				deathAnim = 0;
				setFrogImage(new Image("file:Resources/Images/froggerUp.png", imgSize, imgSize, true, true));
				frogger.noMove = false;
				

				frogger.minusPoints();
				frogger.changeScore = true;
				
				break;
			}
			
		} // end of if
		
		if (frogger.waterDeath) {
			
			frogger.noMove = true;
			
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
				frogger.waterDeath = false;
				deathAnim = 0;
				setFrogImage(new Image("file:Resources/Images/froggerUp.png", imgSize, imgSize, true, true));
				frogger.noMove = false;
				
				frogger.minusPoints();
				frogger.changeScore = true;
				
				break;
			
			} // end of switch
			
		} // end of if
		
	} // end of act()
	
	
	/**
	 * Checks if Frogger is intersecting with other game objects and responds accordingly.
	 * @see com.game.player.Frogger#act(long)
	 */
	public void checkDeath() {
		intersectVehicle = frogger.getIntersectingObjects(Vehicle.class).size() >= 1;
		intersectLog = frogger.getIntersectingObjects(Log.class).size() >= 1;
		intersectTurtleA = frogger.getIntersectingObjects(TurtleA.class).size() >= 1;
		intersectTurtleB = frogger.getIntersectingObjects(TurtleB.class).size() >= 1;
		intersectEnd = frogger.getIntersectingObjects(End.class).size() >= 1;
		
		if (intersectVehicle) {
			frogger.carDeath = true;
		}
		
		
		if (intersectLog && !frogger.noMove) {
			
			if(frogger.getOneIntersectingObject(Log.class).getLeft()) {
				frogger.move(-2,0);
			}
			
			else {
				frogger.move (1,0);
			}
		}
		
		
		else if (intersectTurtleA && !frogger.noMove) {
			
			if (frogger.getOneIntersectingObject(TurtleA.class).isSunk()) {
				frogger.waterDeath = true;
			} 
			
			else {
				
				if(frogger.getOneIntersectingObject(TurtleA.class).getLeft()) {
					frogger.move(-1,0);
				}

				
				else {
					frogger.move(2,0);				
				}

			}
		}
		
		
		else if (intersectTurtleB && !frogger.noMove) {
			
			if (frogger.getOneIntersectingObject(TurtleB.class).isSunk()) {
				frogger.waterDeath = true;
			} 
			
			else {
				
				if(frogger.getOneIntersectingObject(TurtleB.class).getLeft()) {
					frogger.move(-1,0);
				}

				
				else {
					frogger.move(2,0);				
				}

			}
		}
		
		else if (intersectEnd) {
			
			if (frogger.getOneIntersectingObject(End.class).isActivated()) {
				frogger.end--;
				frogger.minusPoints();
			}
			
			
			frogger.addPoints(50);
			frogger.changeScore = true;
			frogger.w = 800;
			frogger.getOneIntersectingObject(End.class).setEnd();
			
			frogger.end++;
			
			frogger.setX(270);
			frogger.setY(679.8 + moveY);
			
			
		}
		
		else if (frogger.getY() < 413){
			frogger.waterDeath = true;
		}
	}
	
	
	/**
	 * Sets this.{@link com.game.player.Frogger} object's image.
	 */
	public void setFrogImage(Image image) {
		frogger.setImage(image);
	}
	
	
	/**
	 * Unused.
	 */
	@Override
	public void act(long now) {}
	

}

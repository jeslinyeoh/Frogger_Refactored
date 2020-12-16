package com.game.player;

import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;

/**
 * Controls the Frogger's movement according to the player's input.
 * @author hcywy2
 *
 */
public class MovementController extends FroggerProperties{

	private Frogger frogger;
	
	/**
	 * Initialises {@link com.game.player.Frogger} object 
	 * and all the images of Frogger's movement.
	 */
	public MovementController(Frogger frogger){
		this.frogger = frogger;
		
		imgW1 = new Image("file:Resources/Images/froggerUp.png", imgSize, imgSize, true, true);
		imgA1 = new Image("file:Resources/Images/froggerLeft.png", imgSize, imgSize, true, true);
		imgS1 = new Image("file:Resources/Images/froggerDown.png", imgSize, imgSize, true, true);
		imgD1 = new Image("file:Resources/Images/froggerRight.png", imgSize, imgSize, true, true);
		imgW2 = new Image("file:Resources/Images/froggerUpJump.png", imgSize, imgSize, true, true);
		imgA2 = new Image("file:Resources/Images/froggerLeftJump.png", imgSize, imgSize, true, true);
		imgS2 = new Image("file:Resources/Images/froggerDownJump.png", imgSize, imgSize, true, true);
		imgD2 = new Image("file:Resources/Images/froggerRightJump.png", imgSize, imgSize, true, true);
		
	}
	
	
	/**
	 * Handles Frogger's movement animation when a specific key is pressed.
	 * @param event Receives input from player's keyboard.
	 */
	public void handleKeyPressed(KeyEvent event) {
		
		// if not dead
		if (!frogger.noMove) {				
						
			switch(event.getCode()) {
						
				case W:
					moveUp();
			        setFrogImage(imgW2);
			        break;
			                
				case A:
					moveLeft();
			        setFrogImage(imgA2);
			        break;
							
				case S:
					moveDown();
			        setFrogImage(imgS2);
			        break;
			            	
				case D:
					moveRight();
			        setFrogImage(imgD2);
			        break;
					
			} // end of switch
            
		} // end of if
			
	} // end of handleKeyPressed()
			 
						

	/**
	 * Handles current score when a specific key is released.
	 * @param event Receives input from player's keyboard.
	 */
	public void handleKeyReleased(KeyEvent event) {	
		
		if (!frogger.noMove) {
				
			switch(event.getCode()) {
					
				case W:
					if (frogger.getY() < frogger.w && frogger.getY() > 100) {
						frogger.changeScore = true;
						frogger.w = frogger.getY();
						frogger.addPoints(10);
					}
							
			        moveUp();
			        setFrogImage(imgW1);
			        break;
			                
			                
				case A:
					moveLeft();
			        setFrogImage(imgA1);
			        break;
			            	
			            	
				case S:
					moveDown();
			        setFrogImage(imgS1);
			        break;
			            	
			            	
				case D:
					moveRight();
			        setFrogImage(imgD1);
			        break;
					
			} // end of switch
				
		} //end of if
		
	} // end of handleKeyReleased()
	
	
	/**
	 * Frogger moves upwards.
	 */
	public void moveUp() {
		frogger.move(0, -moveY);
	} 
	
	
	/**
	 * Frogger moves downwards.
	 */
	public void moveDown() {
		frogger.move(0, moveY);
	}
	
	
	/**
	 * Frogger moves to the left.
	 */
	public void moveLeft() {
		frogger.move(-moveX, 0);
	}
	
	
	/**
	 * Frogger moves to the right.
	 */
	public void moveRight() {
		frogger.move(moveX, 0);
	}
	
	
	/**
	 * Sets {@link com.game.player.Frogger} object's image.
	 */
	public void setFrogImage(Image image) {
		frogger.setImage(image);
	}

	
	/**
	 * Unused.
	 */
	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
	}
	
}

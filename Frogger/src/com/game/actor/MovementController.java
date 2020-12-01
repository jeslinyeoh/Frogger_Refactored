package com.game.actor;

import java.util.ArrayList;

import com.application.Actor;
import com.game.background.End;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;

public class MovementController extends FroggerProperties{

	private boolean second = false;
	private Frogger frogger;
	
	
	public MovementController(Frogger frogger){
		this.frogger = frogger;
		
		imgW1 = new Image("file:Images/froggerUp.png", imgSize, imgSize, true, true);
		imgA1 = new Image("file:Images/froggerLeft.png", imgSize, imgSize, true, true);
		imgS1 = new Image("file:Images/froggerDown.png", imgSize, imgSize, true, true);
		imgD1 = new Image("file:Images/froggerRight.png", imgSize, imgSize, true, true);
		imgW2 = new Image("file:Images/froggerUpJump.png", imgSize, imgSize, true, true);
		imgA2 = new Image("file:Images/froggerLeftJump.png", imgSize, imgSize, true, true);
		imgS2 = new Image("file:Images/froggerDownJump.png", imgSize, imgSize, true, true);
		imgD2 = new Image("file:Images/froggerRightJump.png", imgSize, imgSize, true, true);
		
	}
	
	public void handleKeyPressed(KeyEvent event) {
		
		// if not dead
		if (!frogger.getNoMove()) {				
						
			// if in second part of animation
			if (second) {
						
				switch(event.getCode()) {
							
					case W: 
						moveUp();
						frogger.setChangeScore(false);
						setFrogImage(imgW1);
						second = false;
						break;
				                
					case A:
						moveLeft();
				        setFrogImage(imgA1);
				        second = false;
				        break;
				            				            
					case S: 
						moveDown();
				        setFrogImage(imgS1);
				        second = false;
				        break;
				            	
					case D: 
						moveRight();
				        setFrogImage(imgD1);
				        second = false;
				        break;
						
				} //end of switch	
			   
			} // end of if
					
			
			//else in first part of animation
			else {
						
				switch(event.getCode()) {
						
					case W:
						moveUp();
				        setFrogImage(imgW2);
				        second = true;
				        break;
				                
					case A:
						moveLeft();
				        setFrogImage(imgA2);
				        second = true;
				        break;
								
					case S:
						moveDown();
				        setFrogImage(imgS2);
				        second = true;
				        break;
				            	
					case D:
						moveRight();
				        setFrogImage(imgD2);
				        second = true;
				        break;
						
				} // end of switch
					
			} // end of else 
	            
		} // end of if
				
	} // end of handleKeyPressed();
				 

	public void handleKeyReleased(KeyEvent event) {	
		
		if (!frogger.getNoMove()) {
				
			switch(event.getCode()) {
					
				case W:
					if (frogger.getY() < frogger.getW()) {
						frogger.setChangeScore(true);
						frogger.setW(frogger.getY());
						frogger.addPoints(10);
					}
							
			        moveUp();
			        setFrogImage(imgW1);
			        second = false;
			        break;
			                
			                
				case A:
					moveLeft();
			        setFrogImage(imgA1);
			        second = false;
			        break;
			            	
			            	
				case S:
					moveDown();
			        setFrogImage(imgS1);
			        second = false;
			        break;
			            	
			            	
				case D:
					moveRight();
			        setFrogImage(imgD1);
			        second = false;
			        break;
					
			} // end of switch
				
		} //end of if
		
	} // end of handleKeyReleased()
	
	
	public void moveUp() {
		frogger.move(0, -moveY);
	} 
	
	public void moveDown() {
		frogger.move(0, moveY);
	}
	
	public void moveLeft() {
		frogger.move(-moveX, 0);
	}
	
	public void moveRight() {
		frogger.move(moveX, 0);
	}
	

	public void setFrogImage(Image image) {
		frogger.setImage(image);
	}

	@Override
	public void act(long now) {
		// TODO Auto-generated method stub
	}
	
}

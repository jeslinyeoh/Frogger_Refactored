package com.game;

import com.application.Actor;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;

public class Movement extends Actor{


	Image imgW1, imgW2, imgA1, imgA2;
	Image imgS1, imgS2, imgD1, imgD2;
	int imgSize = 40;
	boolean second = false;
	boolean changeScore = false;
	boolean noMove = false;
	double moveY = 13.3333333*2;
	double moveX = 10.666666*2;

	Frogger frogger;
	
	
	Movement(Frogger frogger){
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
				if (!noMove) {				
						
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
				
	}
				 

	public void handleKeyReleased(KeyEvent event) {	
		
				if (!noMove) {
				
					switch(event.getCode()) {
					
						case W:
							if (frogger.getY() < frogger.getW()) {
								frogger.setChangeScore(true);
								frogger.setW(frogger.getY());
								frogger.addPoints();
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
	}
	
	
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

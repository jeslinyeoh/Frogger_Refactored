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


public class Frogger extends FroggerProperties{
	
	private int points = 0;
	private int end = 0;
	
	private boolean noMove = false;

	private boolean carDeath = false;
	private boolean waterDeath = false;
	private boolean stop = false;
	
	private boolean changeScore = false;
	private double w = 800;

	private MovementController moveCon;
	private DeathController deathCon;

	
	public Frogger() {
		setImage(new Image("file:Images/froggerUp.png", imgSize, imgSize, true, true));
		setX(270);
		setY(679.8+ moveY);
		
		initialiseClasses();
	} // end of constructor
	
	
	public void initialiseClasses() {
		moveCon = new MovementController(this);
		deathCon = new DeathController(this);
	}
	
	
	public void checkKeyEntered() {
		setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event){
				moveCon.handleKeyPressed(event);

			}
		});
		
		setOnKeyReleased(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent event) {
				moveCon.handleKeyReleased(event);
			}
		});
	}
	
	@Override
	public void act(long now) {
		checkKeyEntered();
		
		if (getY() < 0 || getY() > 734) {
			setX(300);
			setY(679.8 + moveY);
		}
		
		if (getX() < 0) {
			move(moveY*2, 0);
		}
		
		deathCon.handleDeath(now);
		deathCon.checkDeath();
		
		if (getX() > 530) {
			move(-moveY*2, 0);
		}
		
		if (getX() == 240 && getY() == 82) {
			stop = true;
		}
		
		//put function here
	}
	
	public void setChangeScore(boolean bool) {
		changeScore = bool;
	}
	
	public boolean getChangeScore() {
		return changeScore;
	}
	
	public void addPoints(int x) {
		points += x;
	}
	
	public void minusPoints() {
		points -= 50;
	}
	
	public void setW(double w) {
		this.w = w;
	}
	
	public double getW() {
		return w;
	}
	
	public boolean getStop() {
		
		if (setStop()) {
			return true;
		}
		
		else {
			return end == 5;
		}
		
	}
	
	public boolean setStop() {
		return true;
	}
	
	public int getPoints() {
		return points;
	}
	
	public boolean getNoMove() {
		return noMove;
	}
	
	public void setNoMove(boolean bool) {
		noMove = bool;
	}
	
	public void setWaterDeath(boolean bool) {
		waterDeath = bool;
	}
	
	public boolean getWaterDeath() {
		return waterDeath;
	}
	
	public void setCarDeath(boolean bool) {
		carDeath = bool;
	}
	
	public boolean getCarDeath() {
		return carDeath;
	}
	
	public void addEnd() {
		end++;
	}
	
	public void minusEnd() {
		end--;
	}
}
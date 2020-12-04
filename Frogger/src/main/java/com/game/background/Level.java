package com.game.background;

import com.application.MyStage;
import com.game.actor.Frogger;
import com.game.score.PopUpHighscore;

import javafx.animation.AnimationTimer;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Level {
	private MyStage myStage;
	private Frogger frogger;

	
	public Level(MyStage myStage, Frogger frogger){
		
		this.myStage = myStage;
		this.frogger = frogger;
	}
	

	
	public void runLevel1() {
		
		myStage.add(new Log("file:Images/log3.png", 0, 170, 0.75, 150));
		myStage.add(new Log("file:Images/log3.png", 220, 170, 0.75, 150));
		myStage.add(new Log("file:Images/log3.png", 440, 170, 0.75, 150));
		
		myStage.add(new TurtleB(600, 217, -1, 130, 130));
		myStage.add(new TurtleA(400, 217, -1, 130, 130));
		myStage.add(new TurtleB(200, 217, -1, 130, 130));
		
		myStage.add(new Log("file:Images/logs.png", 0, 280, -2, 300));
		myStage.add(new Log("file:Images/logs.png", 400, 280, -2, 300));
		
		myStage.add(new Log("file:Images/log3.png", 0, 329, 0.75, 150));
		myStage.add(new Log("file:Images/log3.png", 270, 329, 0.75, 150));
		myStage.add(new Log("file:Images/log3.png", 490, 329, 0.75, 150));
		
		myStage.add(new TurtleA(500, 376, -1, 130, 130));
		myStage.add(new TurtleA(300, 376, -1, 130, 130));
		myStage.add(new TurtleA(700, 376, -1, 130, 130));
		
		
		myStage.add(new Vehicle("file:Images/car1Left.png", 500, 490, -5, 50, 50));
		
		myStage.add(new Vehicle("file:Images/truck2Right.png", 0, 540, 1, 200, 200));
		myStage.add(new Vehicle("file:Images/truck2Right.png", 500, 540, 1, 200, 200));
		
		myStage.add(new Vehicle("file:Images/car1Left.png", 100, 597, -1, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 250, 597, -1, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 400, 597, -1, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 550, 597, -1, 50, 50));
		
		myStage.add(new Vehicle("file:Images/truck1Right.png", 0, 649, 1, 120, 120));
		myStage.add(new Vehicle("file:Images/truck1Right.png", 300, 649, 1, 120, 120));
		myStage.add(new Vehicle("file:Images/truck1Right.png", 600, 649, 1, 120, 120));
	
	}
	
	
	public void runLevel2() {
		
		myStage.add(new Log("file:Images/log3.png", 0, 170, 0.75, 150));
		myStage.add(new Log("file:Images/log3.png", 220, 170, 0.75, 150));
		myStage.add(new Log("file:Images/log3.png", 440, 170, 0.75, 150));
		
		myStage.add(new Log("file:Images/logs.png", 0, 222, -2, 300));
		myStage.add(new Log("file:Images/logs.png", 400, 222, -2, 300));
		
		myStage.add(new TurtleB(600, 270, -1, 130, 130));
		myStage.add(new TurtleA(400, 270, -1, 130, 130));
		myStage.add(new TurtleB(200, 270, -1, 130, 130));
		
		myStage.add(new Log("file:Images/log3.png", 50, 329, 0.75, 150));
		myStage.add(new Log("file:Images/log3.png", 270, 329, 0.75, 150));
		myStage.add(new Log("file:Images/log3.png", 490, 329, 0.75, 150));
		
		myStage.add(new TurtleA(500, 376, -1, 130, 130));
		myStage.add(new TurtleB(300, 376, -1, 130, 130));
		myStage.add(new TurtleA(700, 376, -1, 130, 130));
		
		
		myStage.add(new Vehicle("file:Images/car1Left.png", 100, 490, -1, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 250, 490, -1, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 400, 490, -1, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 550, 490, -1, 50, 50));
		
		myStage.add(new Vehicle("file:Images/truck2Right.png", 0, 540, 1, 200, 200));
		myStage.add(new Vehicle("file:Images/truck2Right.png", 500, 540, 1, 200, 200));
		
		myStage.add(new Vehicle("file:Images/car1Left.png", 500, 597, -6, 50, 50));
		
		myStage.add(new Vehicle("file:Images/truck1Right.png", 0, 649, 1, 120, 120));
		myStage.add(new Vehicle("file:Images/truck1Right.png", 300, 649, 1, 120, 120));
		myStage.add(new Vehicle("file:Images/truck1Right.png", 600, 649, 1, 120, 120));
	
	}
	
	
	public void runLevel3() {
		
		myStage.add(new TurtleA(600, 165, 0.75, 130, 130));
		myStage.add(new TurtleB(400, 165, 0.75, 130, 130));
		myStage.add(new TurtleA(200, 165, 0.75, 130, 130));
		
		myStage.add(new Log("file:Images/log3.png", 0, 225, -2, 150));
		myStage.add(new Log("file:Images/log3.png", 220, 225, -2, 150));
		myStage.add(new Log("file:Images/log3.png", 440, 225, -2, 150));
		
		myStage.add(new Log("file:Images/logs.png", 0, 275, 0.75, 300));
		myStage.add(new Log("file:Images/logs.png", 350, 275, 0.75, 300));
		
		myStage.add(new TurtleA(600, 320, -1, 130, 130));
		myStage.add(new TurtleB(400, 320, -1, 130, 130));
		myStage.add(new TurtleA(200, 320, -1, 130, 130));
		
		myStage.add(new TurtleA(100, 372, 0.75, 130, 130));
		myStage.add(new TurtleA(300, 372, 0.75, 130, 130));
		myStage.add(new TurtleB(700, 372, 0.75, 130, 130));
		
		
		myStage.add(new Vehicle("file:Images/car1Right.png", 100, 490, 3, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Right.png", 400, 490, 3, 50, 50));
		
		myStage.add(new Vehicle("file:Images/truck2Left.png", 0, 540, -2, 200, 200));
		myStage.add(new Vehicle("file:Images/truck2Left.png", 250, 540, -2, 200, 200));
		
		myStage.add(new Vehicle("file:Images/car1Right.png", 500, 597, 5, 50, 50));
		
		myStage.add(new Vehicle("file:Images/truck1Left.png", 0, 649, -1, 120, 120));
		myStage.add(new Vehicle("file:Images/truck1Left.png", 250, 649, -1, 120, 120));
		myStage.add(new Vehicle("file:Images/truck1Left.png", 650, 649, -1, 120, 120));
	
	}
	
	
	public void runLevel4() {
		
		myStage.add(new TurtleA(100, 165, 0.75, 130, 130));
		myStage.add(new TurtleB(300, 165, 0.75, 130, 130));
		myStage.add(new TurtleA(700, 165, 0.75, 130, 130));
		
		myStage.add(new TurtleA(200, 220, -1, 130, 130));
		myStage.add(new TurtleA(400, 220, -1, 130, 130));
		myStage.add(new TurtleB(600, 220, -1, 130, 130));
		
		myStage.add(new Log("file:Images/log3.png", 0, 285, 0.75, 300));
		myStage.add(new Log("file:Images/log3.png", 400, 285, 0.75, 300));

		
		myStage.add(new TurtleA(600, 372, -1, 130, 130));
		myStage.add(new TurtleB(400, 372, -1, 130, 130));
		myStage.add(new TurtleA(200, 372, -1, 130, 130));
		
		
		myStage.add(new Vehicle("file:Images/truck2Right.png", 0, 500, 3, 350, 350));
		
		myStage.add(new Vehicle("file:Images/car1Left.png", 100, 590, -2.5, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 300, 590, -2.5, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 500, 590, -2.5, 50, 50));
		
		myStage.add(new Vehicle("file:Images/truck1Right.png", 0, 649, 1.5, 120, 120));
		myStage.add(new Vehicle("file:Images/truck1Right.png", 250, 649, 1.5, 120, 120));
		myStage.add(new Vehicle("file:Images/truck1Right.png", 650, 649, 1.5, 120, 120));
	}
	
	
	public void runLevel5() {

		myStage.add(new TurtleA(580, 170, -1, 220, 260));
		myStage.add(new TurtleB(360, 170, -1, 220, 260));
		myStage.add(new TurtleA(135, 170, -1, 220, 260));
		
		myStage.add(new Log("file:Images/logs.png", 0, 280, -2, 300));
		myStage.add(new Log("file:Images/logs.png", 400, 280, -2, 300));
		
		myStage.add(new Log("file:Images/log3.png", 50, 329, 0.75, 150));
		myStage.add(new Log("file:Images/log3.png", 270, 329, 0.75, 150));
		myStage.add(new Log("file:Images/log3.png", 490, 329, 0.75, 150));
		
		myStage.add(new TurtleB(500, 376, -1, 130, 130));
		myStage.add(new TurtleA(300, 376, -1, 130, 130));
		myStage.add(new TurtleA(700, 376, -1, 130, 130));
		
		
		myStage.add(new Vehicle("file:Images/car1Left.png", 100, 485, -1.5, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 250, 485, -1.5, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 500, 485, -1.5, 50, 50));
	
		myStage.add(new Vehicle("file:Images/truck1Right.png", 500, 533, 3.5, 60, 60));
		
		myStage.add(new Vehicle("file:Images/car1Left.png", 500, 560, -5.5, 100, 100));
		
		myStage.add(new Vehicle("file:Images/truck2Right.png", 0, 649, 1, 200, 200));
		myStage.add(new Vehicle("file:Images/truck1Right.png", 500, 649, 1, 120, 120));

	
	}
	
	
	
	
}

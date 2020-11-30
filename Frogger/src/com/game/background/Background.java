package com.game.background;


import com.application.ButtonController;
import com.application.MyStage;
import com.game.*;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.PopupWindow;

public class Background {
	public MyStage myStage = new MyStage();
	public Button startButton, insButton;
	public PopupWindow popup;
	
	public void runGameBackground() {	    
	    
		BackgroundImage froggerback = new BackgroundImage("file:Images/froggerBackground.png");
	    
		myStage.add(froggerback);
		
		myStage.add(new Log("file:Images/log3.png", 150, 0, 170, 0.75));
		myStage.add(new Log("file:Images/log3.png", 150, 220, 170, 0.75));
		myStage.add(new Log("file:Images/log3.png", 150, 440, 170, 0.75));
		
		myStage.add(new Log("file:Images/logs.png", 300, 0, 276, -2));
		myStage.add(new Log("file:Images/logs.png", 300, 400, 276, -2));
		
		myStage.add(new Log("file:Images/log3.png", 150, 50, 329, 0.75));
		myStage.add(new Log("file:Images/log3.png", 150, 270, 329, 0.75));
		myStage.add(new Log("file:Images/log3.png", 150, 490, 329, 0.75));
		
		myStage.add(new TurtleA(500, 376, -1, 130, 130));
		myStage.add(new TurtleA(300, 376, -1, 130, 130));
		myStage.add(new TurtleA(700, 376, -1, 130, 130));
		myStage.add(new TurtleB(600, 217, -1, 130, 130));
		myStage.add(new TurtleA(400, 217, -1, 130, 130));
		myStage.add(new TurtleB(200, 217, -1, 130, 130));
		
		
		myStage.add(new End(10,94));
		myStage.add(new End(130,94));
		myStage.add(new End(130 + 130-10,94));
		myStage.add(new End(130 + 2*(130-10)+1,94));
		myStage.add(new End(130 + 3*(130-10)+3,94));
		
		myStage.add(new Vehicle("file:Images/truck1Right.png", 0, 649, 1, 120, 120));
		myStage.add(new Vehicle("file:Images/truck1Right.png", 300, 649, 1, 120, 120));
		myStage.add(new Vehicle("file:Images/truck1Right.png", 600, 649, 1, 120, 120));
	
		myStage.add(new Vehicle("file:Images/car1Left.png", 100, 597, -1, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 250, 597, -1, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 400, 597, -1, 50, 50));
		myStage.add(new Vehicle("file:Images/car1Left.png", 550, 597, -1, 50, 50));
		myStage.add(new Vehicle("file:Images/truck2Right.png", 0, 540, 1, 200, 200));
		myStage.add(new Vehicle("file:Images/truck2Right.png", 500, 540, 1, 200, 200));
		myStage.add(new Vehicle("file:Images/car1Left.png", 500, 490, -5, 50, 50));
		myStage.add(new Digit(0, 30, 530, 25));
	
		
		
		myStage.start();
	}
	
	public void runMenuBackground() {
		
		Image menuback = new Image("file:Images/menuBackground.gif");
		ImageView menubackV = new ImageView();
		
		menubackV.setImage(menuback);
		preserveImage(menubackV);
		
		
		Image froggerTxt = new Image("file:Images/froggerTxt.png");
		ImageView froggerV = new ImageView();
		
		froggerV.setImage(froggerTxt);
		froggerV.setFitWidth(500);
		froggerV.setFitHeight(450);
		preserveImage(froggerV);
		froggerV.setX(30);
		froggerV.setY(80);
		startButton = new Button();
		insButton = new Button();
		ButtonController startButtonCon = new ButtonController(startButton);
		ButtonController insButtonCon = new ButtonController(insButton);
		
		startButtonCon.setButton("Start", 250, 250);
		insButtonCon.setButton("Instructions", 220, 300);
		
		myStage.getChildren().addAll(menubackV, startButton, insButton, froggerV);
		
		
	}
	
	public void preserveImage(ImageView imgV) {
		imgV.setPreserveRatio(true);
		imgV.setSmooth(true);
		imgV.setCache(true);
	}
	
	
	
}

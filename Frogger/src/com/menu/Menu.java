package com.menu;


import com.game.Frogger;
import com.game.background.Background;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


public class Menu extends Application{
	
	Animation timer1;
	Background bmenu = new Background();
	Background bgame = new Background();
	Frogger frogger;
	Scene menuScene, gameScene;
	boolean startGame = false;
	

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Frogger Arcade Game");
		
		
		bmenu.runMenuBackground();
		menuScene = new Scene(bmenu.background, 565, 455);

		primaryStage.setX(450);
		primaryStage.setY(50);
		primaryStage.setScene(menuScene);
		primaryStage.show();
		
		bgame.runGameBackground();
		frogger = new Frogger("file:Images/froggerUp.png");
		bgame.background.add(frogger);
		gameScene = new Scene(bgame.background, 565, 800);
		

		bmenu.startButton.setOnAction(e -> primaryStage.setScene(gameScene));
		bmenu.insButton.setOnAction(e -> PopUpInstructions.display());
		
		
	}
	
	
	
}

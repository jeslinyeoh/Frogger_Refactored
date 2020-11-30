package com.menu;


import com.game.*;
import com.game.background.Background;
import com.game.score.Score;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


public class Menu{
	
	Score score;
	Music music;
	Background bmenu = new Background();
	Background bgame = new Background();
	Frogger frogger;
	Scene menuScene, gameScene;
	private Stage stage;
	boolean startGame = false;

	public void show() {
		
		stage.setTitle("Frogger Arcade Game");
		
		bmenu.runMenuBackground();
		menuScene = new Scene(bmenu.myStage, 565, 455);

		stage.setX(450);
		stage.setY(50);
		stage.setScene(menuScene);
		stage.show();
		
		bgame.runGameBackground();
		frogger = new Frogger();
		bgame.myStage.add(frogger);
		gameScene = new Scene(bgame.myStage, 565, 800);
		

		bmenu.insButton.setOnAction(e -> PopUpInstructions.display());
		
		
		bmenu.startButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				stage.setScene(gameScene);
				score = new Score(frogger, bgame);
				music = new Music(frogger);
			} // end of handle()
			
		});	
		
	
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	
	
}

package com.menu;


import com.game.*;
import com.game.actor.Frogger;
import com.game.background.Background;
import com.game.background.Music;
import com.game.score.PopUpHighscore;
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
import javafx.scene.layout.VBox;


public class Menu{
	
	Background bmenu = new Background();
	Background bgame = new Background();
	Scene menuScene, gameScene;
	private Stage stage;
	boolean startGame = false;
	PopUpHighscore pophighscore = new PopUpHighscore();

	public void show() {
		
		stage.setTitle("Frogger Arcade Game");
		
		bmenu.runMenuBackground();
		menuScene = new Scene(bmenu.myStage, 565, 455);

		stage.setX(450);
		stage.setY(50);
		stage.setScene(menuScene);
		stage.show();
		
		
		bgame.runLevel(stage, 4);
		
		//bgame.myStage.add(frogger);
		gameScene = new Scene(bgame.myStage, 565, 798);
		
		VBox layout = new VBox();
		pophighscore.setRanking(layout);
		
		

		//bmenu.insButton.setOnAction(e -> PopUpInstructions.display());
		
		bmenu.insButton.setOnAction(e -> PopUpHighscore.display(layout));
		
		bmenu.startButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				stage.setScene(gameScene);
			} // end of handle()
			
		});	
		
	
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	public Stage getStage() {
		return stage;
	}
	
}

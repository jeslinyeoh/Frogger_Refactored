package com.menu;



import com.game.background.Background;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Menu{
	
	Background bmenu = new Background();
	Background bgame = new Background();
	Scene menuScene, gameScene;
	private Stage stage;
	

	public void show() {
		
		stage.setTitle("Frogger Arcade Game");
		
		bmenu.runMenuBackground();
		menuScene = new Scene(bmenu.myStage, 565, 455);

		stage.setX(450);
		stage.setY(50);
		stage.setScene(menuScene);
		stage.show();
		
		
		bgame.runLevel(10);
		bgame.setStage(stage);
		
		gameScene = new Scene(bgame.myStage, 565, 798);
		
		bgame.stopMusic();
		
		bmenu.insButton.setOnAction(e -> PopUpInstructions.display());

		
		bmenu.startButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event){
				stage.setScene(gameScene);
				bgame.startMusic();
			} 
			
		});	
		
	
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	public Stage getStage() {
		return stage;
	}

	
	
}

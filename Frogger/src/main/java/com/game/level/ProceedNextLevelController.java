package com.game.level;

import com.application.Main;
import com.application.MyStage;
import com.game.background.Background;
import com.game.score.PopUpHighscore;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProceedNextLevelController {
	
	private Background background = new Background();
	private static int lvl = Background.getLevel();
	private Stage mainStage = Main.getPrimaryStage();
	private Stage highscoreStage = PopUpHighscore.gethsStage();
	
	
	public ProceedNextLevelController() {}
	
	
	@FXML
	private void displayNextLevel(ActionEvent event) {
		Stage currStage =(Stage)((Node)event.getSource()).getScene().getWindow();
	
		background.setMyStage(new MyStage());
		lvl++;
		background.runGameBackground();
		background.runLevel(lvl);
		Background.setLevel(lvl);
		
		Scene gameScene = new Scene(background.getMyStage(), 565, 798);
		mainStage.setScene(gameScene);
		mainStage.show();
		
		currStage.close();
		highscoreStage.close();
	}
	
	
	@FXML
	private void endGame(ActionEvent event) {
		Stage currStage =(Stage)((Node)event.getSource()).getScene().getWindow();
		
		currStage.close();
		highscoreStage.close();
		mainStage.close();
		Platform.exit();
	}
	
	
}

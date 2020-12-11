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

public class EndMessageController {
	
	private Stage mainStage = Main.getPrimaryStage();
	private Stage highscoreStage = PopUpHighscore.gethsStage();
	
	private Background background = new Background();
	
	@FXML
	private void replayGame(ActionEvent event) {
		
		Stage currStage =(Stage)((Node)event.getSource()).getScene().getWindow();
		
		currStage.close();
		highscoreStage.close();
		
		background.runGameBackground();
		background.runLevel(1);
		
		Scene gameScene = new Scene(background.getMyStage(), 565, 798);
		mainStage.setScene(gameScene);
		mainStage.show();
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

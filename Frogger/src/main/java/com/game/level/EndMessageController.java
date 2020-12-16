package com.game.level;

import com.application.Main;
import com.game.background.Background;
import com.game.background.MyStage;
import com.game.score.PopUpHighscore;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Controller class for EndMessage.fxml.
 * @author hcywy2
 *
 */
public class EndMessageController {
	/**
	 * Gets primaryStage from {@link com.application.Main} class.
	 */
	private Stage mainStage = Main.getPrimaryStage();
	
	/**
	 * Gets stage from {@link com.game.score.PopUpHighscore} class.
	 */
	private Stage highscoreStage = PopUpHighscore.gethsStage();
	
	private Background background = new Background();
	
	
	/**
	 * Restart from level 1.
	 * @param event Receives input from the "Play Again" button.
	 */
	@FXML
	private void replayGame(ActionEvent event) {
		
		//Gets the current stage where the event is triggered. 
		Stage currStage =(Stage)((Node)event.getSource()).getScene().getWindow();
		
		currStage.close();
		highscoreStage.close();
		
		background.runGameBackground();
		background.runLevel(1);
		
		Scene gameScene = new Scene(background.getMyStage(), 565, 798);
		mainStage.setScene(gameScene);
		mainStage.show();
	}
	
	
	/**
	 * Ends the game and closes the application.
	 * @param event Receives input from the "No Thanks" button.
	 */
	@FXML
	private void endGame(ActionEvent event) {
		
		//Gets the current stage where the event is triggered. 
		Stage currStage =(Stage)((Node)event.getSource()).getScene().getWindow();
		
		currStage.close();
		highscoreStage.close();
		mainStage.close();
		Platform.exit();
	}
}

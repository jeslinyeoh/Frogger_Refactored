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
 * 
 * Controller class for ProceedNextLevel.fxml.
 * @author hcywy2
 *
 */
public class ProceedNextLevelController {
	
	private Background background = new Background();
	
	/**
	 * Gets current level from {@link com.game.background.Background} class.
	 */
	private static int lvl = Background.getLevel();
	
	/**
	 * Gets primaryStage from {@link com.application.Main} class.
	 */
	private Stage mainStage = Main.getPrimaryStage();
	
	/**
	 * Gets stage from {@link com.game.score.PopUpHighscore} class.
	 */
	private Stage highscoreStage = PopUpHighscore.gethsStage();
	
	
	/**
	 * Displays the next level.
	 * @param event Receives input from the "Yes" button.
	 */
	@FXML
	private void displayNextLevel(ActionEvent event) {
		
		
		//Gets the current stage where the event is triggered. 
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
	
	
	/**
	 * Ends the game and closes the application.
	 * @param event Receives input from the "No" button.
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

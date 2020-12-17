package com.menu;


import com.game.background.Background;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * Controller class for Menu.fxml.
 * @author hcywy2
 *
 */
public class MenuController {
	Background bgame = new Background();
	PopUpInstructionsView popINSv = new PopUpInstructionsView();
	
	/**
	 * Displays Instructions as a pop-up window by calling {@link com.menu.PopUpInstructionsView#display(Stage)}.
	 * @exception Exception On file not found.
	 */
	@FXML
	private void displayInstructions() throws Exception {

		Stage popupins = new Stage();
			
		popupins.setResizable(false);
		popupins.setTitle("Instructions");
		popupins.setX(430);
		popupins.setY(410);
	  
		popINSv.display(popupins);
	}
	
	
	/**
	 * Displays level 1.
	 * @param event Receives input from the "Start" button.
	 */
	@FXML
	private void startGame(ActionEvent event) {
		
		bgame.runGameBackground();
		bgame.runLevel(10);
		
		Scene gameScene = new Scene(bgame.myStage, 565, 798);
		
		Stage currStage =(Stage)((Node)event.getSource()).getScene().getWindow();
		
		currStage.setScene(gameScene);
		currStage.show();
		
		bgame.setStage(currStage);
	}
	
	
}

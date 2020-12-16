package com.game.level;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * View class for EndMessage.fxml.
 * @author hcywy2
 *
 */
public class EndMessageView {
	
	
	/**
	 * Displays pop-up window that prompts player to play again. 
	 * @see com.game.background.Background#checkNextLevel()
	 * @exception Exception On file not found.
	 */
	@FXML
	public void displayPopUp(Stage stage) throws Exception{
		
		Parent eParent = FXMLLoader.load(getClass().getResource("EndMessage.fxml"));
		
		Scene eScene = new Scene(eParent);
		 
		stage.setScene(eScene);
	  
		stage.show();
	}
}

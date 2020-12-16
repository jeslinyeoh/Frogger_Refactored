package com.game.level;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * View class for ProceedNextLevel.fxml.
 * @author hcywy2
 *
 */
public class ProceedNextLevelView {

	
	/**
	 * Displays pop-up window that prompts player to proceed to the next level. 
	 * @see com.game.background.Background#checkNextLevel()
	 * @exception Exception On file not found.
	 */
	public void displayPopUp(Stage stage) throws IOException {
		
		Parent nlParent = FXMLLoader.load(getClass().getResource("ProceedNextLevel.fxml"));
		
		Scene nlScene = new Scene(nlParent);
		 
		stage.setScene(nlScene);
	  
		stage.show();
	}
}

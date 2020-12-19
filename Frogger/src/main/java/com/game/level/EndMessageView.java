package com.game.level;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * View class for EndMessage.fxml.
 * 
 * @author hcywy2
 *
 */
public class EndMessageView {
	
	
	/**
	 * Displays pop-up window that prompts player to play again.
	 * @param stage End Message's stage. 
	 * @see com.game.background.Background#checkNextLevel()
	 * @exception IOException On file not found.
	 */
	public void displayPopUp(Stage stage) throws IOException{
		
		Parent eParent = FXMLLoader.load(getClass().getResource("EndMessage.fxml"));
		
		Scene eScene = new Scene(eParent);
		 
		stage.setScene(eScene);
	  
		stage.show();
	}
}

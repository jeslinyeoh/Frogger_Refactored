package com.menu;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * View class for PopUpInstructions.fxml.
 * @author hcywy2
 *
 */
public class PopUpInstructionsView {
	
	/**
	 * Displays Instructions as a pop-up window.
	 * @see com.menu.MenuController#displayInstructions()
	 * @exception IOException On file not found.
	 */
	public void display(Stage stage) throws IOException {
		Parent insParent = FXMLLoader.load(getClass().getResource("PopUpInstructions.fxml"));
		 
		Scene insScene = new Scene(insParent);
		
		stage.setScene(insScene);
		
		stage.show();
	}
	
	 
}

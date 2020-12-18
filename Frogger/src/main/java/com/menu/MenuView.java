package com.menu;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * View class for Menu.fxml.
 * @author hcywy2
 *
 */
public class MenuView {
	
	
	/**
	 * Displays Main Menu. 
	 * @param stage Primary stage.
	 * @see com.application.Main#start(Stage)
	 * @exception IOException On file not found.
	 */
	public void displayMenu(Stage stage) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		
		stage.show();
	}
}

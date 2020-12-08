package com.menu;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PopUpInstructionsView {
	
	
	public void display(Stage stage) throws IOException {
		Parent insParent = FXMLLoader.load(getClass().getResource("PopUpInstructions.fxml"));
		 
		Scene insScene = new Scene(insParent);
		
		stage.setScene(insScene);
		
		stage.show();
	}
	
	 
}

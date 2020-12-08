package com.game.level;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ProceedNextLevelView {

	public void displayPopUp(Stage stage) throws IOException {
		
		Parent nlParent = FXMLLoader.load(getClass().getResource("ProceedNextLevel.fxml"));
		
		Scene nlScene = new Scene(nlParent);
		 
		stage.setScene(nlScene);
	  
		stage.show();
	}
}

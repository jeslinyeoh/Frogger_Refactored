package com.game.level;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EndMessageView {
	
	@FXML
	public void displayPopUp(Stage stage) throws Exception{
		
		Parent eParent = FXMLLoader.load(getClass().getResource("EndMessage.fxml"));
		
		Scene eScene = new Scene(eParent);
		 
		stage.setScene(eScene);
	  
		stage.show();
	}
}

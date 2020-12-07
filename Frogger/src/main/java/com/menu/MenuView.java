package com.menu;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MenuView {
	
	public void displayMenu(Stage stage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
		
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
	}
}

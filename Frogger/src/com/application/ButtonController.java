package com.application;



import javafx.scene.control.Button;
import javafx.scene.image.Image;

public class ButtonController {
	
	private Button button;
	
	
	public ButtonController(Button button) {
		this.button = button;
	}
	
	
	public void setButton(String butTxt, int xPos, int yPos) {
		
		button.setText(butTxt);
		button.setStyle("-fx-background-color: pink, #b6e7c9; "
				+ "-fx-text-fill: green; "
				+ "-fx-font-size: 20;");
		
		button.setLayoutX(xPos);
		button.setLayoutY(yPos);
	}
	
	
}

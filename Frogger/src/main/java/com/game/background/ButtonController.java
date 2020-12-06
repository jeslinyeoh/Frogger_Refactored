package com.game.background;


import javafx.scene.control.Button;


public class ButtonController {
	
	private Button button;
	
	
	public ButtonController(Button button) {
		this.button = button;
	}
	

	public void setButton(String butTxt, int xPos, int yPos, String colour, int size) {
		
		button.setText(butTxt);
		button.setStyle("-fx-background-color: "+ colour +"; "
				+ "-fx-text-fill: green; "
				+ "-fx-font-size: "+ size +";");
		
		button.setLayoutX(xPos);
		button.setLayoutY(yPos);
	}
	
	
}

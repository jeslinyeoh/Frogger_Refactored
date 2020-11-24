package com.menu;

import javafx.stage.Stage;

public class MenuController {
	
	private Menu model;
	private MenuView view;
	private Stage stage;
	
	
	public MenuController(Menu menu, MenuView menuView){
		model = menu;
		view = menuView;
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
		model.setStage(stage);
	}
	
	public MenuView getMenuView() {
		return view;
	}
	
	
	public Menu getMenu() {
		return model;
	}
}

package com.menu;

import javafx.stage.Stage;

public class MenuController {
	
	private Menu m;
	private MenuView mv;
	private Stage stage;
	
	
	public MenuController(Menu menu, MenuView menuView){
		m = menu;
		mv = menuView;
	}
	
	public void setStage(Stage stage) {
		this.stage = stage;
		m.setStage(stage);
	}
	
	public MenuView getMenuView() {
		return mv;
	}
	
	
	public Menu getMenu() {
		return m;
	}
}

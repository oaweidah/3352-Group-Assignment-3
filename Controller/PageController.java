package controllers;

public class PageController {
//Declaring variables for view and controller
	models.Page model;
	views.ContentView view;
	
	//Constructor function for accessing variables
	public PageController (models.Page model, views.ContentView view) {
		this.model = model;
		this.view = view;
		this.view.setController(this);
		view.show();
	}
	
	public void updatePage(String content, int i) {
		model.setSection(i, content);
		view.show();
	}
  }

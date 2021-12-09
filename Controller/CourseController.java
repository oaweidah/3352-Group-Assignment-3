package controllers;

public class PageController {
//declare variables for view and controller
	models.Page model;
	views.ContentView view;
	
	//constructor function to access variables
	public PageController (models.Page model, views.ContentView view) {
		this.model = model;
		this.view = view;
		//set the controller (in view) whenever a new CourseController is made
		this.view.setController(this);
		
		//used to display LectureContent view
		view.show();
	}
	
	public void updatePage(String content, int i) {
		
		
		//use setCourseName and setCourseNumber functions defined in the Course model to populate model variables
		model.setSection(i, content);
		
		//prompt LectureContent view to display updated Course
		view.show();
	}
  }

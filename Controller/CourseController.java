package controllers;

public class CourseController {
//declare variables for view and controller
	models.Course model;
	views.LectureContent view;
	
	//constructor function to access variables
	public CourseController (models.Course model, views.LectureContent view) {
		this.model = model;
		this.view = view;
		//set the controller (in view) whenever a new CourseController is made
		this.view.setController(this);
		
		//used to display LectureContent view
		view.show();
	}
	
	public void updateCourse(String courseNameNum) {
		//use split function to separate name and number (allows updateCourse to take only one field)
		
		//the split courseNameNum will be assigned to courseNum and courseName
		String courseName = "";
		String courseNum = "";
		
		//use setCourseName and setCourseNumber functions defined in the Course model to populate model variables
		model.setCourseName(courseName);
		model.setCourseNumber(courseNum);
		
		//prompt LectureContent view to display updated Course
		view.show();
	}
  }

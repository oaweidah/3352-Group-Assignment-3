package views;

public class ContentView {
	//declare variables for view and controller
	private models.Course model;
	private controllers.PageController controller;
	
	//empty constructor
	public ContentView() {}
	
	public void show() {
		//display or refresh to show PageController class
	}
	
	//event handler for update
	public void onCourseUpdate () {
		//collect data from user
		
		//collects a collection of course number and name to be split in the controller
		String newCourseInfo = "CourseNum - CourseName";
		
		//view is updated within controller by calling updateCourse
		this.controller.updateCourse(newCourseInfo);
	}

	//setters and getters for Course and CourseController
	public models.Course getModel() {
		return model;
	}

	public void setModel(models.Course model) {
		this.model = model;
	}

	public controllers.PageController getController() {
		return controller;
	}

	public void setController(controllers.PageController controller) {
		this.controller = controller;
	}
}

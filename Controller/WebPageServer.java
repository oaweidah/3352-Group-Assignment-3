package controllers;

public class WebPageServer {
	models.LessonPageStorage model;
	views.InstructorLessonView viewI;
	views.Student viewS;

//constructor for webpage server
	public WebPageServer(models.LessonPageStorage model, views.InstructorLessonView viewI, views.Student viewS) {

		this.model = model;
		this.viewI = viewI;// creates model and views
		this.viewS = viewS;

		viewI.show();
		viewS.show(); // displays views

	}

//update the server
	public void updateServer(models.Observer c) {
		model.attach(c);
		viewI.show();// attach collabspace and display views
		viewS.show();
	}
}

package controllers;

public class CommentManagement {

	models.LessonPageStorage model;
	views.InstructorLessonView viewI;
	views.Student viewS;

	// constructor for comment management
	public CommentManagement(models.LessonPageStorage model, views.InstructorLessonView viewI, views.Student viewS) {

		this.model = model;
		this.viewI = viewI;
		this.viewS = viewS;// creates model and views

		viewI.show();
		viewS.show();// displays views

	}

	public void updateComment(String[] comment) {
		model.setComment(comment);
		viewI.show();
		viewS.show(); // attach comment and display views
	}

}
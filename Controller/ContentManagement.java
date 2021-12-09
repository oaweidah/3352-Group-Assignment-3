package controllers;

public class ContentManagement {
	models.LessonPageStorage model;
	views.InstructorLessonView viewI;
	views.Student viewS;

	// constructor for contente management
	public ContentManagement(models.LessonPageStorage model, views.InstructorLessonView viewI, views.Student viewS) {

		this.model = model;
		this.viewI = viewI;
		this.viewS = viewS;// creates model and views

		viewI.show();
		viewS.show();// displays views

	}

	public void updateContent(String[] text) {
		model.setText(text);
		viewI.show();
		viewS.show(); // attach content and display views
	}

}
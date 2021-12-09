package controllers;

public class CollabSpaceServer {
	models.CollabSpaceStorage model;
	views.Instructor viewI;
	views.Student viewS;

	public CollabSpaceServer(models.CollabSpaceStorage model, views.Instructor viewI, views.Student viewS) {

		this.model = model;
		this.viewI = viewI;// creates model and views
		this.viewS = viewS;

		viewI.show();
		viewS.show(); // displays views

	}

	public void updateModel(models.CollabSpace c) {

		model.attach(c);

		viewI.show();// attach collabspace and display views
		viewS.show();
	}

}

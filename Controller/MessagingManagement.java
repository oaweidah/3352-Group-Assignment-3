package controllers;

public class MessagingManagement {

	models.CollabSpaceStorage model;
	views.Instructor viewI;
	views.Student viewS;
//constructor for messaging management
	public MessagingManagement(models.CollabSpaceStorage model, views.Instructor viewI, views.Student viewS) {

		this.model = model; // creates model and views
		this.viewI = viewI;
		this.viewS = viewS;

		viewI.show();
		viewS.show();// displays views

	}
//update the model
	public void updateModel(models.CollabSpace f) {

		model.attach(f);

		viewI.show(); // attach feature and display views
		viewS.show();
	}

}

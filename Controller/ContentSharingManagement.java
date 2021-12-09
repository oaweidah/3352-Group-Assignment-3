package controllers;

public class ContentSharingManagement {

	models.CollabSpaceStorage model;
	views.Instructor viewI;
	views.Student viewS;
//constructor for content sharing management
	public ContentSharingManagement(models.CollabSpaceStorage model, views.Instructor viewI, views.Student viewS) {

		this.model = model;
		this.viewI = viewI;
		this.viewS = viewS;// creates model and views

		viewI.show();
		viewS.show();// displays views

	}

	public void updateModel(models.CollabSpace f) {

		model.attach(f);

		viewI.show();
		viewS.show(); // attach model and display views
	}

}

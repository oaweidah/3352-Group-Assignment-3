
package controllers;

public class MemberManagement {
	
	models.CollabSpaceStorage model;
	views.Instructor viewI;
	
	
	public MemberManagement(models.CollabSpaceStorage model,views.Instructor viewI) {
		
		this.model = model;
		this.viewI = viewI;//creates model and views
	
		
		viewI.show();//displays view
	
		
		
	}
	//update the model
	public void updateModel (models.CollabSpace m) {
		
		model.attach(m);
		                  //attach member and display view
		viewI.show();
	
	}
	

}

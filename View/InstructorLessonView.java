package views;

//need to add extend models observer
public class InstructorLessonView {

	models.LessonPageStorage model;
	controllers.CommentManagement commentManagement;
	views.InstructorView iv;
	controllers.ContentManagement contentManagement;
	controllers.WebPageServer wps;
	controllers.OrganizationManagement organizationManagement;

	// constructor for instructor lesson view
	public InstructorLessonView(models.LessonPageStorage model, controllers.CommentManagement commentManagement,
			controllers.ContentManagement contentManagement, controllers.WebPageServer wps,
			controllers.OrganizationManagement organizationManagement) {
		this.setModel(model);
		;
		this.setContentController(contentManagement);
		this.setCommentController(commentManagement);
		this.setOrganizationController(organizationManagement);
		this.setWebController(wps);

	};

	// general instructor
	public InstructorLessonView() {
	}

//method to add content to instructor lesson view
	public void onAddContent(String[] comment, String[] text, String[] imagePath, String[] filePath) {
		// takes in the type of content the instructor wants to add
		model.setComment(comment);
		model.setFilePath(filePath);
		model.setText(text);
		model.setImagePath(imagePath);

	}

	// method for adding page on instructor lesson view
	public void onAddPage(String pageName) {
		// collects which template the instructor wants
		model.setPageName(pageName);
	}

	// updates display
	public void update() {
		this.show();
	}

	// getters and setters for instructor lesson page view
	public models.LessonPageStorage getModel() {
		return model;
	}

	public void setModel(models.LessonPageStorage model) {
		if (this.model != null)
			this.model.detach(this);

		this.model = model;
		this.model.attach(this);
	}

	public controllers.CommentManagement getCommentController() {
		return commentManagement;
	}

	public void setCommentController(controllers.CommentManagement commentManagement) {
		this.commentManagement = commentManagement;
	}

	public controllers.OrganizationManagement getOrganizationController() {
		return organizationManagement;
	}

	public void setOrganizationController(controllers.OrganizationManagement organizationManagement) {
		this.organizationManagement = organizationManagement;
	}

	public controllers.ContentManagement getContentController() {
		return contentManagement;
	}

	public void setContentController(controllers.ContentManagement contentManagement) {
		this.contentManagement = contentManagement;
	}

	public controllers.WebPageServer getWebController() {
		return wps;
	}

	public void setWebController(controllers.WebPageServer wps) {
		this.wps = wps;
	}

	// general methods for instructor lesson view
	public void show() {
		// display
	}

	public void refresh() {
		// refresh
	}

	public void approveStudentComments() {
		// instructor can approve students comments
	}

	public void approveStudentContent() {
		// approve student content posted
	}

	public void deleteStudentComments() {
		// instructor can delete students comments
	}

}

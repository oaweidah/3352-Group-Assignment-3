package views;

public class StudentLessonView extends models.Observer {
	models.LessonPageStorage model;
	controllers.CommentManagement commentManagement;
	views.InstructorView iv;
	controllers.ContentManagement contentManagement;
	controllers.WebPageServer wps;
	controllers.OrganizationManagement organizationManagement;

	// the constructor that takes in all the controllers
	public StudentLessonView(models.LessonPageStorage model, controllers.CommentManagement commentManagement,
			controllers.ContentManagement contentManagement, controllers.WebPageServer wps,
			controllers.OrganizationManagement organizationManagement) {
		this.setModel(model);
		;
		this.setContentController(contentManagement);
		this.setCommentController(commentManagement);
		this.setOrganizationController(organizationManagement);
		this.setWebController(wps);

	};

	// general constructor
	public StudentLessonView() {
	}

	// takes in text, comment, image paths or file paths depending on user liking
	public void onAddContent(String[] comment, String[] text, String[] imagePath, String[] filePath) {
		// takes in the type of content the instructor wants to add
		model.setComment(comment);
		model.setFilePath(filePath);
		model.setText(text);
		model.setImagePath(imagePath);

	}

	// unsure
	public void onAddPage(String pageName) {
		// collects which template the instructor wants
		model.setPageName(pageName);
	}

	// update refreshes screen by calling show again
	public void update() {
		this.show();
	}

	// getters and setters
	public models.LessonPageStorage getModel() {
		return model;
	}

	// setting model using attach and detach from observer
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

	public void show() {
		// display
	}

}

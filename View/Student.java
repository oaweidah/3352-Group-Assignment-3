package views;

public class Student {
	private models.CollabSpaceStorage collabSpaceStorage;
	private controllers.CollabSpaceServer collabSpaceServer;
	private controllers.ContentSharingManagement contentSharingManagement;
	private controllers.MemberManagement memberManagement;
	private controllers.MessagingManagement messagingManagement;

//the constructor the students view of the collabspace
	public Student(models.CollabSpaceStorage collabSpaceStorage, controllers.CollabSpaceServer collabSpaceServer,
			controllers.ContentSharingManagement contentSharingManagement,
			controllers.MessagingManagement messagingManagement) {
		this.setCollabSpaceStorage(collabSpaceStorage);
		this.setCollabSpaceServer(collabSpaceServer);
		this.setContentSharingManagement(contentSharingManagement);
		this.setMessagingManagement(messagingManagement);
	}

	// general constructor for student
	public Student() {
	}

	// getters and setters for the collabspace storage
	public void setCollabSpaceStorage(models.CollabSpaceStorage collabSpaceStorage) {
		if (this.collabSpaceStorage != null) {// while there are objects in the arraylist detach
			this.collabSpaceStorage.dettach(this);
		}
		this.collabSpaceStorage = collabSpaceStorage;
		this.collabSpaceStorage.attach(this);// attaches to the model
	}

	public models.CollabSpaceStorage getCollabSpaceStorage() {
		return collabSpaceStorage;
	}

	public void show() {
		// display collaboration content
	}

	// getters and setters for the student CollabSpace view controllers
	public controllers.CollabSpaceServer getControllerServer() {
		return collabSpaceServer;
	}

	public controllers.ContentSharingManagement getControllerContent() {
		return contentSharingManagement;
	}

	public controllers.MessagingManagement getControllerMessaging() {
		return messagingManagement;
	}

	public void setCollabSpaceServer(controllers.CollabSpaceServer collabSpaceServer) {
		this.collabSpaceServer = collabSpaceServer;
	}

	public void setContentSharingManagement(controllers.ContentSharingManagement contentSharingManagement) {
		this.contentSharingManagement = contentSharingManagement;
	}

	public void setMessagingManagement(controllers.MessagingManagement messagingManagement) {
		this.messagingManagement = messagingManagement;
	}

}

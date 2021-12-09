package views;

public class Instructor {
	private models.CollabSpaceStorage collabSpaceStorage;
	private controllers.CollabSpaceServer collabSpaceServer;
	private controllers.ContentSharingManagement contentSharingManagement;
	private controllers.MemberManagement memberManagement;
	private controllers.MessagingManagement messagingManagement;

//constructor for instructor Collabspace view
	public Instructor(models.CollabSpaceStorage collabSpaceStorage, controllers.CollabSpaceServer collabSpaceServer,
			controllers.ContentSharingManagement contentSharingManagement,
			controllers.MemberManagement memberManagement, controllers.MessagingManagement messagingManagement) {
		this.setCollabSpaceStorage(collabSpaceStorage);
		this.setCollabSpaceServer(collabSpaceServer);
		this.setContentSharingManagement(contentSharingManagement);
		this.setMemberManagement(memberManagement);
		this.setMessagingManagement(messagingManagement);
	}

	// general constructor
	public Instructor() {
	}

	// setters and getters for CollabSpaceStorage
	public void setCollabSpaceStorage(models.CollabSpaceStorage collabSpaceStorage) {
		if (this.collabSpaceStorage != null) {// detatch while there are still objects in the collabSpaceStorage
			this.collabSpaceStorage.dettach(this);
		}
		this.collabSpaceStorage = collabSpaceStorage;
		this.collabSpaceStorage.attach(this);
	}

	public models.CollabSpaceStorage getCollabSpaceStorage() {
		return collabSpaceStorage;
	}

	// method to show the collabSpace to the user
	public void show() {
		// display collaboration content
	}

	// setters and getters for collabSpace controllers
	public controllers.CollabSpaceServer getControllerServer() {
		return collabSpaceServer;
	}

	public controllers.ContentSharingManagement getControllerContent() {
		return contentSharingManagement;
	}

	public controllers.MemberManagement getControllerMember() {
		return memberManagement;
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

	public void setMemberManagement(controllers.MemberManagement memberManagement) {
		this.memberManagement = memberManagement;
	}

	public void setMessagingManagement(controllers.MessagingManagement messagingManagement) {
		this.messagingManagement = messagingManagement;
	}

}

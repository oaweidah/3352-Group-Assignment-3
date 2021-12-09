package views;

public class InstructorView  extends models.Observer {
    //declare variables for view and controller
    private models.Page model;
    private controllers.PageController controller;
    public InstructorView(models.Page model, controllers.PageController controller){
        this.setModel(model);
        this.setController(controller);
        this.model.attach(this);
    }
    public void update(){
        //display or refresh to show PageController class
        this.show();
    }
    public void onPageUpdate(){
        //collect data from user
        String newPageInfo="PageNum - PageName";
        //view is updated within controller by calling updatePage
        this.controller.updatePage(newPageInfo);
    }
    //empty constructor
    public InstructorView(){}
    public void show(){}
    //setters and getters for Course and CourseController
    public models.Page getModel(){
        return model;
    }
    public void setModel(models.Page model){
        if(this.model!=null)
            this.model.detach(this);

        this.model=model;
        this.model.attach(this);
    }
    public controllers.PageController getController(){
        return controller;
    }
    public void setController(controllers.PageController controller){
        this.controller=controller;
    }

}

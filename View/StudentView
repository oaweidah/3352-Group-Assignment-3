package views;

public class StudentView extends models.Observer {
    //declare variables for view and controller
    private models.Page model;
    private controllers.PageController controller;
    public StudentView(models.Page model, controllers.PageController controller){
        this.setModel(model);
        this.setController(controller);
        this.model.attach(this);
    }
    public void update(){
        //display or refresh to show PageController class
        this.show();
    }
    
    //event handler for update
    public void onPageUpdate(){
        //collect data from user
        String newPageInfo="PageNum - PageName";
        //view is updated within controller by calling updatePage
        this.controller.updatePage(newPageInfo);
    }
    //empty constructor
    public StudentView(){}
    public void show(){}
    public models.Page getModel(){
        return model;
    }
    //setters and getters for Course and PageController
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

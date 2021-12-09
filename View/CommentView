package views;

public class CommentView extends models.Observer {
    private models.Page model;
    private controllers.PageController controller;

    //set the constructor
    public CommentView(models.Page model, controllers.PageController controller){
        this.setModel(model);
        this.setController(controller);
        this.model.attach(this);
    }

    //display or refresh to show PageController
    public void update(){
        this.show();
    }

    //event handler for update
    public void onPageUpdate(){
        String newPageInfo="Add Comment: ";
        //updates view within controller by calling updatePage
        this.controller.updatePage(newPageInfo);
    }

    public CommentView(){}

    //display/refresh to show PageController
    public void show(){}

    //setter and getter for Page model
    public models.Page getModel(){
        return model;
    }

    public void setModel(models.Page model){
        if(this.model!=null)
            this.model.detach(this);

        this.model = model;
        this.model.attach(this);
    }

    //setter and getter for PageController
    public controllers.PageController getController(){
        return controller;
    }
    public void setController(controllers.PageController controller){
        this.controller=controller;
    }
}

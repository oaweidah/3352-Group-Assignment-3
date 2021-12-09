package models;

public class Page {
  private Section[] sections;
  
  public void setSection(int index, String content){
    sections[index].setContent(content);
  }
  
  public String getSection(){
    String[] content;
    for (int i : sections){
      content.push(sections[i].getContent());
    } 
    return content;
  }

}

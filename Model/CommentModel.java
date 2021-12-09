package Models;
import java.util.Date;

public class Comment{
  private String comment;
  private Date commentDate;
  private String authorName;
  private Boolean isReply;

  
  public String getComment(){
    return comment;
  }
  
  public void setComment(String comment){
    this.comment = comment;
  }
  
  public Date getCommentDate(){
    return commentDate;
  }
  
  public void setCommentDate(Date commentDate){
    this.commentDate = commentDate;
  }
  
  public String getAuthorName(){
    return authorName;
  }
  
  public void setAuthorName(String authorName){
    this.authorName = authorName;
  }
  
  public Boolean getIsReply(){
    return isReply;
  }
  
  public void setIsReply(Boolean isReply){
    this.isReply = isReply;
  }
}

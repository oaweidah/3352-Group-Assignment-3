package models;
import java.util.Date;

public class Content {
    private String content;
    private Date contentUploadDate;
    private String authorName;
    

    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }

    public Date getContentUploadDate() {
        return contentUploadDate;
    }

    public void setContentUploadDate(Date contentUploadDate) {
        this.contentUploadDate = contentUploadDate;
    }


    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}

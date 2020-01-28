package academy.everyonecodes.java.week6.set1.exercise3;

public class Post {
    private String title;
    private String content;
    private Date dateCreated;
    private Boolean isPublished;

    public Post(String title, String content, Date dateCreated, Boolean isPublished) {
        this.title = title;
        this.content = content;
        this.dateCreated = dateCreated;
        this.isPublished = isPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Boolean getPublished() {
        return isPublished;
    }
}

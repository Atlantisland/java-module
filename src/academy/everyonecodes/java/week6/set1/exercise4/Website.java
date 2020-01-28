package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;

import java.util.Optional;

public class Website {
    private String content;
    private String url;
    private Optional<Blog> blog;

    public Website(String content, String url, Optional<Blog> blog) {
        this.content = content;
        this.url = url;
        this.blog = blog;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }

    public Optional<Blog> getBlog() {
        return blog;
    }
}

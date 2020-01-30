package academy.everyonecodes.java.week6.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PublishedPostCounterTest {

    PublishedPostCounter counter = new PublishedPostCounter();

    @Test
    void countReceivesNoPosts() {
        List<Post> posts = List.of();
        testCount(0, posts);
    }

    @Test
    void countReceivesNoPublishedPosts() {
        List<Post> posts = List.of(createPost(false), createPost(false));
        testCount(0, posts);
    }

    @Test
    void countReceivesOnePublishedPosts() {
        List<Post> posts = List.of(createPost(true), createPost(false));
        testCount(1, posts);
    }

    @Test
    void countReceivesTwoPublishedPosts() {
        List<Post> posts = List.of(createPost(true), createPost(true));
        testCount(2, posts);
    }

    void testCount(int expected, List<Post> posts) {
        Blog blog = createBlog(posts);

        int result = counter.count(blog);

        Assertions.assertEquals(expected, result);
    }

    Blog createBlog(List<Post> posts) {
        Date date = new Date(01, 01, 2020);
        return new Blog("title", posts, date);
    }

    Post createPost(boolean isPublished) {
        Date date = new Date(01, 01, 2020);
        return new Post("title", "Content", date, isPublished);
    }


}
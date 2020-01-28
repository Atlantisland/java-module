package academy.everyonecodes.java.week6.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PublishedPostCounterTest {

    PublishedPostCounter counter = new PublishedPostCounter();

    @Test
    void countOnePost() {
        Date date = new Date(1, 3, 2020);
        Post postOne = new Post("Post TitleOne", "Content One", date, true);
        Post postTwo = new Post("Post TitleTwo", "Content Two", date, false);
        List<Post> posts = List.of(postOne, postTwo);
        Blog blog = new Blog("Blog Title", posts, date);
        int result = counter.count(blog);
        int expected = 1;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void countNoPost() {
        Date date = new Date(1, 3, 2020);
        Post postOne = new Post("Post TitleOne", "Content One", date, false);
        Post postTwo = new Post("Post TitleTwo", "Content Two", date, false);
        List<Post> posts = List.of(postOne, postTwo);
        Blog blog = new Blog("Blog Title", posts, date);
        int result = counter.count(blog);
        int expected = 0;
        Assertions.assertEquals(expected, result);
    }

    @Test
    void countThreePosts() {
        Date date = new Date(1, 3, 2020);
        Post postOne = new Post("Post TitleOne", "Content One", date, true);
        Post postTwo = new Post("Post TitleTwo", "Content Two", date, true);
        Post postThree = new Post("Post TitleThree", "Content Three", date, true);
        List<Post> posts = List.of(postOne, postTwo, postThree);
        Blog blog = new Blog("Blog Title", posts, date);
        int result = counter.count(blog);
        int expected = 3;
        Assertions.assertEquals(expected, result);
    }

}
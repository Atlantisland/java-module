package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;
import academy.everyonecodes.java.week6.set1.exercise3.Date;
import academy.everyonecodes.java.week6.set1.exercise3.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BlogCreationDateRetrieverTest {
    BlogCreationDateRetriever retriever = new BlogCreationDateRetriever();

    @Test
    void retrieve() {
        Date date = new Date(1, 3, 2020);
        Post postOne = new Post("Post TitleOne", "Content One", date, true);
        Post postTwo = new Post("Post TitleTwo", "Content Two", date, true);
        Post postThree = new Post("Post TitleThree", "Content Three", date, true);
        List<Post> posts = List.of(postOne, postTwo, postThree);
        Blog blog = new Blog("Blog title", posts, date);
        Website website = new Website("content", "url", Optional.of(blog));
        Optional<Date> oResult = retriever.retrieve(website);

        Assertions.assertTrue(oResult.isPresent());
        Date result = oResult.get();
        Date expected = new Date(1, 3, 2020);
        Assertions.assertEquals(expected.getDay(), result.getDay());
        Assertions.assertEquals(expected.getMonth(), result.getMonth());
        Assertions.assertEquals(expected.getYear(), result.getYear());
    }

}
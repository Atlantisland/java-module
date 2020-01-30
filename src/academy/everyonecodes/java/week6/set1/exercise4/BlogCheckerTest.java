package academy.everyonecodes.java.week6.set1.exercise4;

import academy.everyonecodes.java.week6.set1.exercise3.Blog;
import academy.everyonecodes.java.week6.set1.exercise3.Date;
import academy.everyonecodes.java.week6.set1.exercise3.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BlogCheckerTest {
    BlogChecker checker = new BlogChecker();

    @Test
    void hasBlogReturnsFalse() {
        Website website = new Website("www.everyonecodes.academy", "content", Optional.empty());

        boolean result = checker.hasBlog(website);

        Assertions.assertFalse(result);
    }

    @Test
    void hasBlogReturnsTrue() {
        Date date = new Date(01, 01, 2020);
        Blog blog = new Blog("title", List.of(), date);
        Website website = new Website("www.everyonecodes.academy", "content", Optional.of(blog));

        boolean result = checker.hasBlog(website);

        Assertions.assertTrue(result);
    }

}

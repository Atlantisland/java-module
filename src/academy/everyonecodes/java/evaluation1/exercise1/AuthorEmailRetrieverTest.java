package academy.everyonecodes.java.evaluation1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorEmailRetrieverTest {
    AuthorEmailRetriever retriever = new AuthorEmailRetriever();

    @Test
    void retrieveUsersEmail() {
        User derek = new User("derek@derek.eu", "3valuat1on");
        Comment comment = new Comment("Title", "content", derek);
        String result = retriever.retrieve(comment);
        String expected = "derek@derek.eu";
        Assertions.assertEquals(expected, result);
    }

}
package academy.everyonecodes.java.evaluation1.exercise1;

public class AuthorEmailRetriever {
    public String retrieve(Comment comment) {
        User user = comment.getAuthor();
        String usersEmail = user.getEmail();
        return usersEmail;
    }
}

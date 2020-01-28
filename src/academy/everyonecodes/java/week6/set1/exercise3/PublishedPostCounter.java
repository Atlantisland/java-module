package academy.everyonecodes.java.week6.set1.exercise3;

public class PublishedPostCounter {
    public int count(Blog blog) {
        int counter = 0;
        for (Post post : blog.getPosts()) {
            if (post.getPublished()) {
                counter = counter + 1;
            }

        }

        return counter;

    }
}

package academy.everyonecodes.java.week6.set1.exercise4;

import java.util.Optional;

public class BlogChecker {
    public Boolean hasBlog(Website website) {
        if (website.getBlog().isPresent()) {
            return true;
        }
        return false;

    }
}

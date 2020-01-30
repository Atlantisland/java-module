package academy.everyonecodes.java.week2.serciceClassExamples.Exercise2;

import academy.everyonecodes.java.week2.serciceClassExamples.Exercise2.Attendee;
import academy.everyonecodes.java.week2.serciceClassExamples.Exercise2.MovieSuggestion;

import java.util.List;

public class MovieSelector {

    public MovieSuggestion select(List<Attendee> attendees, List<MovieSuggestion> suggestions) {
        for(MovieSuggestion suggestion : suggestions) {
            if(isSuitable(suggestion, attendees)) {
                return suggestion;
            }
        }

        return suggestions.get(0);
    }

    private boolean isSuitable(MovieSuggestion movie, List<Attendee> attendees) {
        for(Attendee attendee : attendees) {
            if(attendee.getAge() < movie.getMinimumAge()) {
                return false;
            }
        }

        return true;
    }
}

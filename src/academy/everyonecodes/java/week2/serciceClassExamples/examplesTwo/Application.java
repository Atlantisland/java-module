package academy.everyonecodes.java.week2.serciceClassExamples.examplesTwo;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        AttendeeCollector attendeeCollector = new AttendeeCollector();
        SuggestionCollector suggestionCollector = new SuggestionCollector();
        MovieSelector movieSelector = new MovieSelector();

        List<Attendee> attendees = attendeeCollector.collect();
        List<MovieSuggestion> suggestions = suggestionCollector.collect(attendees);

        MovieSuggestion movie = movieSelector.select(attendees, suggestions);
        System.out.println("We will watch" + movie.getMovieTitle() + "!");
    }

}

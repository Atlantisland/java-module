package academy.everyonecodes.java.week2.serciceClassExamples.examplesTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuggestionCollector {
    public List<MovieSuggestion> collect(List<Attendee> attendees) {
        Scanner scanner = new Scanner(System.in);

        List<MovieSuggestion> suggestions = new ArrayList<>();

        for (Attendee attendee : attendees) {
            System.out.println(attendee.getAttendeeName() + " , what movie would you like to watch?");
            String title = scanner.nextLine();

            System.out.println("And what is the minimu age to watch it?");
            int minimumAge = scanner.nextInt();
            scanner.nextLine();

            MovieSuggestion nextSuggestion = new MovieSuggestion(title, minimumAge);
            suggestions.add(nextSuggestion);
        }

        return suggestions;
    }
}

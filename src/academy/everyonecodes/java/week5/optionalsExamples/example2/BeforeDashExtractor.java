package academy.everyonecodes.java.week5.optionalsExamples.example2;

import java.util.List;
import java.util.Optional;

public class BeforeDashExtractor {
    public Optional<String> extract(String input) {
        List<String> parts = List.of(input.split("-"));
        if (parts.size() <= 1) {
            return Optional.empty();
        }
        return Optional.of(parts.get(0));
    }

}

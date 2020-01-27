package academy.everyonecodes.java.week5.optionalsExamples.example1;

import java.util.List;
import java.util.Optional;

public class FilmCharacterParser {
    public Optional<FilmCharacter> parse(String data) {
        List<String> parts = List.of(data.split(";"));
        if(parts.size() <2) {
            return Optional.empty();
        }
        String firstName = parts.get(0);
        String lastName = parts.get(1);
        if(firstName.isEmpty() || lastName.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(new FilmCharacter(firstName, lastName));
    }
}

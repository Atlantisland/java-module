package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GotDataParser {
    public Optional<Character> parseLine(String input) {
        List<String> dataCharacter = Arrays.asList(input.split(";", -1));
        String name = dataCharacter.get(0);
        String bookOfDeath = dataCharacter.get(3);
        String gender = dataCharacter.get(6);
        Character currentCharacter = new Character(name, bookOfDeath, gender);
        if (dataCharacter.size() > 3) {
            return Optional.of(currentCharacter);
        }
        return Optional.empty();

    }

}
package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.*;

public class LongestNameFinder {
    public Optional<Character> find(List<Character> characters) {
        if (characters.isEmpty()) {
            return Optional.empty();
        }
        Character longestName = characters.get(0);
        for (Character character : characters) {
            if (hasLongerName(character, longestName)) {
                longestName = character;
            }
        }
        return Optional.of(longestName);
    }

    private boolean hasLongerName(Character character, Character longestName) {
        return character.getName().length() > longestName.getName().length();
    }
}


package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.*;

public class LongestNameFinder {
    public Optional<Character> find(List<Character> characterList) {
        if (characterList.isEmpty()) {
            return Optional.empty();
        }

        Character characterWithLongestName = characterList.get(0);

        for (Character character : characterList) {
            String characterName = character.getName();
            if (characterName.length() > characterWithLongestName.getName().length()) {
                characterName = characterWithLongestName.getName();
            }

        }
        return Optional.of(characterWithLongestName);
    }
}
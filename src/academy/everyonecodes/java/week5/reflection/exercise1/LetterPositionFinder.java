package academy.everyonecodes.java.week5.reflection.exercise1;

import java.util.Optional;

public class LetterPositionFinder {
    public Optional<Integer> find(String word, String letter) {
        if (!word.contains(letter)) {
            return Optional.empty();
        }
        return Optional.of(word.indexOf(letter));

    }
}

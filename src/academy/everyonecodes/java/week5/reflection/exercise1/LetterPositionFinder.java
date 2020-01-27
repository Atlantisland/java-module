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

// I am totally blocked (:D) therefore I write my strategy:

//In order to cover the case that the word doesnt have the letter:
//use -> condition with contain method and returns Optional.empty

//in order to cover the case that the word has the letter:
// take every letter of the word (use-> traits) and compare it with the letter-> use loop (along the length of the word)
// and use -> equals method.
//at the end it returns Optional.of() with the position where letter is into the word.


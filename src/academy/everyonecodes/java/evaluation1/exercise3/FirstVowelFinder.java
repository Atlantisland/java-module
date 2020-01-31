package academy.everyonecodes.java.evaluation1.exercise3;

import java.util.List;
import java.util.Optional;

public class FirstVowelFinder {
    private List<String> vowels = List.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
    private VowelCounter counter = new VowelCounter();

    public Optional<String> find(String word) {
        List<String> letters = counter.getLetters(word);
        for (String letter : letters) {
            if (vowels.contains(letter)) {
                return Optional.of(letter);
            }
        }
        return Optional.empty();

    }
}

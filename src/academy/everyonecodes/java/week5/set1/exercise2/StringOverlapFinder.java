package academy.everyonecodes.java.week5.set1.exercise2;

import java.util.Optional;

public class StringOverlapFinder {
    public Optional<String> find(String wordOne, String wordTwo) {

        boolean lengthWordOne = wordOne.isEmpty();
        boolean lengthWordTwo = wordTwo.isBlank();
        if (!lengthWordOne && !lengthWordTwo) {
            for (int i = wordTwo.length(); i > 0; i--) {
                wordTwo = wordTwo.substring(0, i);
                if (wordOne.endsWith(wordTwo)) {
                    return Optional.of(wordTwo);
                }
            }

        }
        return Optional.empty();
    }
}

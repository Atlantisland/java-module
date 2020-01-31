package academy.everyonecodes.java.evaluation1.exercise3;


import java.util.ArrayList;
import java.util.List;


public class VowelCounter {
    private List<String> vowels = List.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");

    public int count(String word) {
        List<String> letters = getLetters(word);
        int counter = 0;
        for (String letter : letters) {
            if (vowels.contains(letter)) {
                counter++;
            }
        }
        return counter;
    }

    List<String> getLetters(String word) {
        List<String> letters = List.of(word.split(""));
        List<String> lettersCopy = new ArrayList<>(letters);
        return lettersCopy;
    }

}

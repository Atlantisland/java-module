package academy.everyonecodes.java.optionals.sets.exercise2;

import java.util.*;

public class BasicDictionary {
    private List<String> dictionary;

    public BasicDictionary() {
        dictionary = List.of(
                "hi",
                "house",
                "dog",
                "cat",
                "table",
                "chair",
                "elephant");
    }

    public List<String> findUnknownsWords(String text) {
        LinkedHashSet<String> finalList = new LinkedHashSet<>();
        List<String> lines = Arrays.asList(text.split(" "));
        lines.stream()
                .map(String::toLowerCase)
                .filter(word -> !dictionary.contains(word) && !word.isBlank())
                .forEach(word -> finalList.add(word));
        return new ArrayList<>(finalList);

    }
}
package academy.everyonecodes.java.optionals.sets.exercise2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BasicDictionary {
    private Set<String> dictionary;

    public BasicDictionary() {
        dictionary =  new LinkedHashSet<>(List.of("hi", "house", "dog", "cat", "table", "chair", "elephant"));
    }
}

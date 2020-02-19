package academy.everyonecodes.java.optionals.sets.exercise1;

import java.util.*;

public class IntegerListDuplicateRemover {

    public List<Integer> remove(List<Integer> numbers) {
        Set<Integer> setNumbers = new LinkedHashSet<>(numbers);
        List<Integer> result = new ArrayList<>(new LinkedHashSet<>(setNumbers));
        return result;

    }

}

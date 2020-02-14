package academy.everyonecodes.java.optionals.sets;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IntegerListDuplicateRemover {

    public Set<Integer> remove(List<Integer> numbers) {
        Set<Integer> hset = new LinkedHashSet<>(numbers);
        return hset;

    }

}

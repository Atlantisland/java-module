package academy.everyonecodes.java.week4.examplesSet2.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerListDescendingSorter {

    public List<Integer> sort(List<Integer> integers) {
        List<Integer> integerCopy = new ArrayList<>(integers);
        Collections.sort(integerCopy);
        Collections.reverse(integerCopy);
        return integerCopy;
    }
}

package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMaximumFinder {
    public Optional<Double> find(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return Optional.empty();
        }
        ArrayList<Double> numbersCopy = new ArrayList<>(numbers);
        Collections.sort(numbersCopy);
        Collections.reverse(numbersCopy);
        return Optional.of(numbersCopy.get(0));

    }

}

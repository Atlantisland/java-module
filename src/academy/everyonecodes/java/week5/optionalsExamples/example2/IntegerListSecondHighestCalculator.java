package academy.everyonecodes.java.week5.optionalsExamples.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class IntegerListSecondHighestCalculator {
    public Optional<Integer> calculate(List<Integer> input) {
        if(input.size()<2) {
            return Optional.empty();
        }
        ArrayList<Integer> inputCopy = new ArrayList<>(input);
        Collections.sort(inputCopy);
        Collections.reverse(inputCopy);
        return Optional.of(inputCopy.get(1));
    }
}

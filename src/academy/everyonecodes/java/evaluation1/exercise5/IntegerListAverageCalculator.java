package academy.everyonecodes.java.evaluation1.exercise5;

import java.util.List;
import java.util.Optional;

public class IntegerListAverageCalculator {

    public Optional<Double> calculate(List<Integer> integers){
        if(integers.isEmpty()) {
            return Optional.empty();
        }
        double total = 0.0;
        for(Integer number : integers){
            total += number;
        }
        double average = total / integers.size();
        return Optional.of(average);
    }
}

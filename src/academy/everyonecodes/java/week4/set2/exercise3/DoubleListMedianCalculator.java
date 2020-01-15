package academy.everyonecodes.java.week4.set2.exercise3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class DoubleListMedianCalculator {
    public double calculate(List<Double> numbers) {
        List<Double> result = new ArrayList<>(numbers);
        Collections.sort(result);
        int size = result.size();
        int position = size / 2;
        if (size == 0) {
            return 0.0;
        }
        if (!(size % 2 == 0)) {
            double median = result.get(position);
            return median;
        }
        return (result.get(position) + result.get(position - 1)) / 2;

    }
}

package academy.everyonecodes.java.week4.set2.exercise4;

import academy.everyonecodes.java.week4.set2.exercise3.DoubleListMedianCalculator;

import java.util.ArrayList;
import java.util.List;

public class DoubleListFromMedianSubtractor {
    public List<Double> calculate(List<Double> numbers) {
        DoubleListMedianCalculator calculator = new DoubleListMedianCalculator();
        double median = calculator.calculate(numbers);
        List<Double> newNumbers = new ArrayList<>();
        for (Double number : numbers) {
            double newValue = number - median;
            newNumbers.add(newValue);
        }
        return newNumbers;
    }
}

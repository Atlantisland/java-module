package academy.everyonecodes.java.evaluation1.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LineAverageCalculator {
    private IntegerListAverageCalculator calculator = new IntegerListAverageCalculator();

    public String calculate(String line) {
        List<Integer> numbers = getNumbers(line);
        return getAverage(numbers);
    }

    private List<Integer> getNumbers(String line){
        List<Integer> numbers = new ArrayList<>();
        List<String> characters = List.of(line.split(" "));
        for(String character : characters) {
            Integer number = Integer.valueOf(character);
            numbers.add(number);
        }
        return numbers;
    }

    private String getAverage(List<Integer> numbers){
        Optional<Double> oAverage = calculator.calculate(numbers);
        if(oAverage.isEmpty()) {
            return "";
        }
        Double average = oAverage.get();
        return String.valueOf(average);
    }
}

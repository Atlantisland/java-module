package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LinesCalculator {
    private StringToIntegerParser parser = new StringToIntegerParser();
    private IntegerListSumCalculator calculator = new IntegerListSumCalculator();

    public List<String> calculate(List<String> inputLines) {
        List<String> outputLines = new ArrayList<>();
        for(String line : inputLines) {
            String number = sumOne(line);
            outputLines.add(number);
        }
        return outputLines;
    }
    String sumOne(String line){
        List<Integer> numbers = parser.parse(line);
        int result = calculator.calculate(numbers);
        return String.valueOf(result);
    }
}

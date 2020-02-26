package academy.everyonecodes.java.week7.evaluationExercises.exercise5;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegersParser {
    public List<Integer> parse(String stringOfNumbers) {
        List<String> listOfNumbers = List.of(stringOfNumbers.split(" "));
        List<Integer> numbers = new ArrayList<>();
        for(String string : listOfNumbers){
            int number = Integer.valueOf(string);
            numbers.add(number);

        }
        return numbers;
    }
}

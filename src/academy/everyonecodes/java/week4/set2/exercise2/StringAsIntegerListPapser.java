package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringAsIntegerListPapser {
    public List<Integer> parse(String input) {
        String[] inputs = input.split(";");
        List<Integer> numbers = new ArrayList<>();
        for (String number : inputs) {
            int result = Integer.valueOf(number);
            numbers.add(result);
        }
        return numbers;

    }
}

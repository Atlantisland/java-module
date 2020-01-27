package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StringToIntegerParser {
    public List<Integer> parse(String text) {
        List<String> strings = List.of(text.split(";"));
        List<Integer> numbers = new ArrayList<>();
        for (String string : strings) {
            int number = Integer.valueOf(string);
            numbers.add(number);
        }
        return numbers;
    }

}

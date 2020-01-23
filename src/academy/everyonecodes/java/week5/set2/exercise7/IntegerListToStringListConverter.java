package academy.everyonecodes.java.week5.set2.exercise7;

import java.util.ArrayList;
import java.util.List;

public class IntegerListToStringListConverter {
    public List<String> convert(List<Integer> numbers) {
        List<String> strings = new ArrayList<>();
        for (int number : numbers) {
            try {
                String element = String.valueOf(number);
                strings.add(element);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }


        }
        return strings;
    }
}

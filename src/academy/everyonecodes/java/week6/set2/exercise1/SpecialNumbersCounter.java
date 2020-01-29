package academy.everyonecodes.java.week6.set2.exercise1;

import java.util.List;

public class SpecialNumbersCounter {
    public int count(int number) {
        String input = String.valueOf(number);
        List<String> digits = List.of(input.split(""));
        int counter = 0;
        if (digits.contains("3") || digits.contains("6") || digits.contains("9")) {
            for (String digit : digits) {
                if (digit.equals("3") || digit.equals("6") | digit.equals("9")) {
                    counter++;
                }

            }
        }
        return counter;
    }
}
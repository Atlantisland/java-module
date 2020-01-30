package academy.everyonecodes.java.week6.set2.exercise1;

import java.util.List;

public class SpecialNumbersCounter {
    private List<String> special = List.of("3", "6", "9");

    public int count(int number) {
        List<String> digits = getDigits(number);
        int appearances = 0;
        for (String digit : digits) {
            if (special.contains(digit)) {
                appearances++;
            }
        }
        return appearances;
    }

    List<String> getDigits(int number) {
        String digits = String.valueOf(number);
        return List.of(digits.split(""));
    }

}
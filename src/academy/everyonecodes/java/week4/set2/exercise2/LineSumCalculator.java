package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.List;

public class LineSumCalculator {
    public int calculate(String input) {
        StringAsIntegerListPapser stringAsIntegerListPapser = new StringAsIntegerListPapser();
        List<Integer> numbers = stringAsIntegerListPapser.parse(input);
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}

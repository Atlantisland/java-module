package academy.everyonecodes.java.week5.reflection.exercise2;

import java.util.List;
import java.util.Optional;

public class IntegerListSumCalculator {
    public int calculate(List<Integer> integers) {
        int sum = 0;
        for (int number : integers) {
            sum = sum + number;
        }
        return sum;
    }

}

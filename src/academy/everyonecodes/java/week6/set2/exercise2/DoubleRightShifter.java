package academy.everyonecodes.java.week6.set2.exercise2;

import java.util.Collections;
import java.util.List;

public class DoubleRightShifter {
    public List<Double> shiftTwo(List<Double> numbers) {
        Collections.rotate(numbers, 2);
        return numbers;
    }
}

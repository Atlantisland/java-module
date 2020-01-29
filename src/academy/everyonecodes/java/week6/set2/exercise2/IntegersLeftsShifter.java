package academy.everyonecodes.java.week6.set2.exercise2;

import java.util.Collections;
import java.util.List;

public class IntegersLeftsShifter {
    public void shiftOne(List<Integer> numbers) {
        Collections.rotate(numbers, -1);
    }

}

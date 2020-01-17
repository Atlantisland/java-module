package academy.everyonecodes.java.week4.reflection.exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MaxOrMinPicker {
    public int pick(List<Integer> numbers) {
        Random random = new Random();

        int size = numbers.size();
        if (numbers.isEmpty()) {
            return numbers.get(random.nextInt(size));
        }

        List<Integer> integerCopy = new ArrayList<>(numbers);
        Collections.sort(integerCopy);
        int highestValue = integerCopy.get(size - 1);
        int lowestValue = integerCopy.get(0);
        List<Integer> highAndLowValues = new ArrayList<>();
        highAndLowValues.add(highestValue);
        highAndLowValues.add(lowestValue);
        return highAndLowValues.get(random.nextInt(highAndLowValues.size()));
    }
}

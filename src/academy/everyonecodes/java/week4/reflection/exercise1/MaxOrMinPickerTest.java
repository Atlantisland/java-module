package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxOrMinPickerTest {
    MaxOrMinPicker picker = new MaxOrMinPicker();

    @Test
    void pickOne() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int result = picker.pick(numbers);
        Assertions.assertTrue(numbers.contains(result));
    }

    @Test
    void pickTwo() {
        List<Integer> numbers = List.of(5, 8, 1, 3);
        int result = picker.pick(numbers);
        Assertions.assertTrue(numbers.contains(result));
    }


    @Test
    void pickThree() {
        List<Integer> numbers = List.of();
        int result = picker.pick(numbers);
        Assertions.assertTrue(numbers.contains(result));
    }


}


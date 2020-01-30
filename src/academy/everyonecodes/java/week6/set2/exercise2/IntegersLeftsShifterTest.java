package academy.everyonecodes.java.week6.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegersLeftsShifterTest {
    IntegersLeftsShifter shifter = new IntegersLeftsShifter();

    @Test
    void shiftOneLength0() {
        List<Integer> numbers = new ArrayList<>();

        List<Integer> result = shifter.shiftOne(numbers);

        List<Integer> expected = List.of();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shiftOneLength1() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        List<Integer> result = shifter.shiftOne(numbers);

        List<Integer> expected = List.of(1);
        Assertions.assertEquals(expected, result);

    }

    @Test
    void shiftOneLength2() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        List<Integer> result = shifter.shiftOne(numbers);

        List<Integer> expected = List.of(2, 1);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shiftOneLength3() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<Integer> result = shifter.shiftOne(numbers);

        List<Integer> expected = List.of(2, 3, 1);
        Assertions.assertEquals(expected, result);
    }
}



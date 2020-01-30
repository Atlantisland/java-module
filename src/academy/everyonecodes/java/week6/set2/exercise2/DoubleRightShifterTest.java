package academy.everyonecodes.java.week6.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleRightShifterTest {
    DoubleRightShifter shifter = new DoubleRightShifter();

    @Test
    void shiftOneLength0() {
        List<Double> numbers = new ArrayList<>();

        List<Double> result = shifter.shiftTwo(numbers);

        List<Double> expected = List.of();
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shiftTwoLength1() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);

        List<Double> result = shifter.shiftTwo(numbers);

        List<Double> expected = List.of(1.0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shiftTwoLength2() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);

        List<Double> result = shifter.shiftTwo(numbers);

        List<Double> expected = List.of(1.0, 2.0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void shiftTwoLength3() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);

        List<Double> result = shifter.shiftTwo(numbers);

        List<Double> expected = List.of(2.0, 3.0, 1.0);
        Assertions.assertEquals(expected, result);
    }


}


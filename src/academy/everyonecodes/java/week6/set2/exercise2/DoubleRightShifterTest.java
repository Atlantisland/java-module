package academy.everyonecodes.java.week6.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleRightShifterTest {
    DoubleRightShifter shifter = new DoubleRightShifter();

    @Test
    void shiftEmptyList() {
        List<Double> input = List.of();
        List<Double> copyInput = new ArrayList<>(input);
        shifter.shiftTwo(copyInput);
        List<Double> result = List.of();
        List<Double> copyExpected = new ArrayList<>(copyInput);
        Assertions.assertEquals(copyExpected, result);
    }

    @Test
    void shift() {
        List<Double> input = List.of(1.5, 2.3, 3.4, 4.6);
        List<Double> copyInput = new ArrayList<>(input);
        shifter.shiftTwo(copyInput);
        List<Double> expected = List.of(3.4, 4.6, 1.5, 2.3);
        List<Double> copyExpected = new ArrayList<>(expected);
        Assertions.assertEquals(copyExpected, copyInput);
    }

}


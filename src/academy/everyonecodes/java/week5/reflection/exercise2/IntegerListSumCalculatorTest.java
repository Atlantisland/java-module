package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListSumCalculatorTest {
    IntegerListSumCalculator calculator = new IntegerListSumCalculator();

    @Test
    void calculateReturnsZeroForEmptyList() {
        List<Integer> input = List.of();

        int result = calculator.calculate(input);

        Assertions.assertEquals(0, result);

    }

    @Test
    void calculateReturnsSumForListWithMultipleElements() {
        List<Integer> input = List.of(-5, -36, -85, 100);

        int result = calculator.calculate(input);

        Assertions.assertEquals(-26, result);
    }

    @Test
    void sumReturnsWithMixInteger() {
        List<Integer> input = List.of(-5, -36, 85, 100);

        int result = calculator.calculate(input);

        Assertions.assertEquals(144, result);
    }
}
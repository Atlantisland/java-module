package academy.everyonecodes.java.week5.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListAverageCalculatorTest {
    IntegerListAverageCalculator calculator = new IntegerListAverageCalculator();

    @Test
    void calculatorReturnsEmptyOptionalForEmptyList() {
        List<Integer> input = List.of();

        Optional<Double> oResult = calculator.calculate(input);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void calculatorReturnsAverage() {
        List<Integer> input = List.of(4, 9, 6, 2, 3, 7, 10);

        Optional<Double> oResult = calculator.calculate(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(5.0, oResult.get());

    }

    @Test
    void calculatorReturnsAverageWithNegativeInteger() {
        List<Integer> input = List.of(-4, 9, -6, 2, -3, 7, -20);

        Optional<Double> oResult = calculator.calculate(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(-2.0, oResult.get());

    }

    @Test
    void calculateReturnsZeroForNumbersThatAddToZero() {
        List<Integer> integers = List.of(-2, -1, 2, 1);

        Optional<Double> oResult = calculator.calculate(integers);

        Assertions.assertTrue(oResult.isPresent());
        double expected = 0;
        Assertions.assertEquals(expected, oResult.get());
    }

}
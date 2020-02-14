package academy.everyonecodes.java.evaluation1.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListAverageCalculatorTest {
    IntegerListAverageCalculator averageCalculator = new IntegerListAverageCalculator();

    @Test
    void calculateReturnsEmptyOptionalForEmptyList() {
        List<Integer> integers = List.of();
        Optional<Double> oResult = averageCalculator.calculate(integers);
        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void calculateReturnsZeroForNumbersThatAddToZero() {
        List<Integer> integers = List.of(-2, -1, 2, 1);

        Optional<Double> oResult = averageCalculator.calculate(integers);
        Assertions.assertTrue(oResult.isPresent());
        double expected = 0.0;
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void calculateReturnsCorrectAverageForPositiveNumbers() {
        List<Integer> integers = List.of(1, 4, 3, 2);
        Optional<Double> oResult = averageCalculator.calculate(integers);
        double expected = 2.5;
        Assertions.assertEquals(expected, oResult.get());
    }

    @Test
    void calculateReturnsCorrectAverageForNegativeNumbers() {
        List<Integer> integers = List.of(-1, -2);
        Optional<Double> oResult = averageCalculator.calculate(integers);
        double expected = -1.5;
        Assertions.assertEquals(expected, oResult.get());
    }

}
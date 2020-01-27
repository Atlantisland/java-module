package academy.everyonecodes.java.week5.optionalsExamples.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListSecondHighestCalculatorTest {
    IntegerListSecondHighestCalculator calculator = new IntegerListSecondHighestCalculator();

    @Test
    void calculateReturnsEmptyOptionalForEmptyList() {
        List<Integer> input = List.of();

        Optional<Integer> oResult = calculator.calculate(input);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void calculateReturnsEmptyOptionalForListWithOneEntry() {
        List<Integer> input = List.of(2);

        Optional<Integer> oResult = calculator.calculate(input);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void calculateReturnsMiddleEntryForListWithThreeEntries() {
        List<Integer> input = List.of(2, 4, 1);

        Optional<Integer> oResult = calculator.calculate(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(2, oResult.get());
    }

    @Test
    void calculateReturnsSecondHighestEntryForListWithFiveEntries() {
        List<Integer> input = List.of(2, 6, 3, 1, 4);

        Optional<Integer> oResult = calculator.calculate(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(4, oResult.get());
    }

}
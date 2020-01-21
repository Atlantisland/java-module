package academy.everyonecodes.java.week5.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListMinimumFinderTest {
    DoubleListMinimumFinder finder = new DoubleListMinimumFinder();

    @Test
    void finderReturnsEmptyOptionalForEmptyList() {
        List<Double> input = List.of();

        Optional<Double> oResult = finder.find(input);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @Test
    void finderReturnsMinimum() {
        List<Double> input = List.of(4.5, 9.0, 6.1, 2.9, 3.8, 7.0, 10.4);

        Optional<Double> oResult = finder.find(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(2.9, oResult.get());

    }

    @Test
    void finderReturnsMinimumWithNegativeDouble() {
        List<Double> input = List.of(-4.5, 9.0, -6.1, 2.9, -3.8, 7.0, -20.4);

        Optional<Double> oResult = finder.find(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(-20.4, oResult.get());

    }


}
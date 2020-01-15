package academy.everyonecodes.java.week4.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListMedianCalculatorTest {
    DoubleListMedianCalculator calculator = new DoubleListMedianCalculator();

    @Test
    void calculateFromEvenList() {
        List<Double> input = List.of(1.0, 2.0, 3.0, 4.0);
        Double result = calculator.calculate(input);
        Double expected = 2.5;
        Assertions.assertEquals(expected, result);
    }
    @Test
    void calculateFromOddList() {
        List<Double> input = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        Double result = calculator.calculate(input);
        Double expected = 3.0;
        Assertions.assertEquals(expected, result);
    }
    @Test
    void calculateFromEmptyList() {
        List<Double> input = List.of();
        Double result = calculator.calculate(input);
        Double expected = 0.0;
        Assertions.assertEquals(expected, result);
    }



}

package academy.everyonecodes.java.week4.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListFromMedianSubtractorTest {
    DoubleListFromMedianSubtractor calculator = new DoubleListFromMedianSubtractor();

    @Test
    void calculateFromOddList(){
        List<Double> input = List.of(1.0, 4.0, 2.0, 10.0, 11.5);
        List<Double> result = calculator.calculate(input);
        List<Double> expected = List.of(-3.0, 0.0, -2.0, 6.0, 7.5);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateFromEvenList(){
        List<Double> input = List.of(1.0, 4.0, 2.0, 10.0);
        List<Double> result = calculator.calculate(input);
        List<Double> expected = List.of(-2.0, 1.0, -1.0, 7.0);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void calculateFromEmptyList(){
        List<Double> input = List.of();
        List<Double> result = calculator.calculate(input);
        List<Double> expected = List.of();
        Assertions.assertEquals(expected, result);
    }
}
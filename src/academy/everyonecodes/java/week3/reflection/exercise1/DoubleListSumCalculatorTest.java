package academy.everyonecodes.java.week3.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListSumCalculatorTest {
    DoubleListSumCalculator doubleListSumCalculator = new DoubleListSumCalculator();

    @ParameterizedTest
    @CsvSource({
            "6.2, 1.1, 2.1, 3.0",
            "-6.2, -1.1, -2.1, -3.0",
            "-5.2, -0.1, -2.1, -3.0"
    })
    void calculate(double expected, List<Double> input) {
        double result = doubleListSumCalculator.calculate(input);

        Assertions.assertEquals(expected, result);
    }


}
package academy.everyonecodes.java.week3.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DoubleCalculatorTest {
    DoubleCalculator doubleCalculator = new DoubleCalculator();

    @ParameterizedTest
    @CsvSource({
            "50.0, 25.0, 25.0",
            "0.0, 0.0, 0.0",
            "-2.0, -1.0, -1.0"
    })
    void sumDouble(double expected, double input1, double input2) {
        double result = doubleCalculator.sumDouble(input1, input2);

        Assertions.assertEquals(expected, result);

    }
}
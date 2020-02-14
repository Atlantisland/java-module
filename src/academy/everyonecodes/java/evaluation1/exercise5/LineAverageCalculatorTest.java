package academy.everyonecodes.java.evaluation1.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LineAverageCalculatorTest {
    LineAverageCalculator calculator = new LineAverageCalculator();

    @ParameterizedTest
    @CsvSource({
            "0.0, 0",
            "1.0, 0 2",
            "1.5, 1 2"
    })
    void calculateReturnsResult(String expected, String line) {
        String result = calculator.calculate(line);
        Assertions.assertEquals(expected, result);
    }

}
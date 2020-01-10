package academy.everyonecodes.java.week3.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteValueCalculatorTest {
    AbsoluteValueCalculator absoluteValueCalculator = new AbsoluteValueCalculator();

    @ParameterizedTest
    @CsvSource({
            "0.0, -0.0",
            "2.0, +2.0",
            "35.5, -35.5"
    })
    void calculate(double expected, double input) {
        double result = absoluteValueCalculator.calculate(input);

        Assertions.assertEquals(expected, result);
    }


}
package academy.everyonecodes.java.week6.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumCalculatorTest {
    DigitSumCalculator calculator = new DigitSumCalculator();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 11",
            "3, 12",
            "6, 123",
            "14, 1292",
            "17, 248102",
    })
    void calculate(int expected, int number) {
        int result = calculator.calculate(number);

        Assertions.assertEquals(expected, result);
    }



}
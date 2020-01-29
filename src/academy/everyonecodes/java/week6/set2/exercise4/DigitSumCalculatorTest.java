package academy.everyonecodes.java.week6.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumCalculatorTest {
    DigitSumCalculator calculator = new DigitSumCalculator();

    @ParameterizedTest
    @CsvSource({
            "9, 1220030100",
            "12, 39",
            "0, 0"
    })

    void calculate(int expected, int input){
        int result = calculator.calculate(input);
        Assertions.assertEquals(expected, result);
    }

}
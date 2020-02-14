package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractionTest {
    Operator operator = new Subtraction();

    @Test
    void getSymbol() {
        String result = operator.getSymbol();

        String expected = "-";
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "-1, -1, 0",
            "-1, 0, 1",
            "0, 1, 1",
            "0, -1, -1",
            "-2, -1, 1",
    })
    void operate(double expected, double number1, double number2) {
        double result = operator.operate(number1, number2);

        assertEquals(expected, result);
    }


}
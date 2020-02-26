package academy.everyonecodes.java.week8.set2.exercise3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {
    Calculator calculator = new Calculator();

    static Stream<Arguments> successParameters() {
        return Stream.of(
                Arguments.of(0, new Calculation("+", 0, 0)),
                Arguments.of(0, new Calculation("-", 0, 0)),
                Arguments.of(0, new Calculation("*", 0, 0)),
                Arguments.of(0, new Calculation("/", 0, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("successParameters")
    void calculateFindsOperation(double expected, Calculation calculation) {
        Optional<Double> oResult = calculator.calculate(calculation);

        assertTrue(oResult.isPresent());
        assertEquals(expected, oResult.get());
    }

    @Test
    void calculateDoesNotFindOperation() {
        Calculation calculation = new Calculation("$", 0, 0);

        Optional<Double> oResult = calculator.calculate(calculation);

        assertTrue(oResult.isEmpty());
    }

}
package academy.everyonecodes.java.week9.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ChangeUnitsCalculatorTest {

    ChangeUnitsCalculator calculator = new ChangeUnitsCalculator();

    static Stream<Arguments> parameters() {
        List<MoneyUnit> thirtyThree = List.of(new Euro20(), new Euro10(), new Euro2(), new Euro1());
        List<MoneyUnit> thousend = List.of(new Euro200(), new Euro200(), new Euro200(), new Euro200(), new Euro200());
        List<MoneyUnit> zero = List.of();


        return Stream.of(
                Arguments.of(thirtyThree, 33),
                Arguments.of(thousend, 1000.0),
                Arguments.of(zero, 0.0)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(List<MoneyUnit> expected, double input) {
        List<MoneyUnit> result = calculator.calculate(input);
        assertEquals(expected, result);

    }
}
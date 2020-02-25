package academy.everyonecodes.java.week10.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CreditTest {

    Credit evaluator = new Credit();

    static Stream<Arguments> parameters(){
        return Stream.of(
                Arguments.of("American Express", 378282246310005L),
                Arguments.of("American Express", 371449635398431L),
                Arguments.of("Master Card", 2221000000000009L),
                Arguments.of("Master Card", 2223000048400011L),
                Arguments.of("Visa", 4999991111111113L),
                Arguments.of("Visa", 4999992222222229L),
                Arguments.of("Invalid", 6011111111111117L)

        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void evaluate(String expected, long input){
        String result = evaluator.evaluate(input);

        Assertions.assertEquals(expected, result);
    }

}

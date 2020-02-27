package academy.everyonecodes.java.evaluationTwo.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberNameFinderTest {

    NumberNameFinder finder = new NumberNameFinder();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.of("ZERO"), List.of("one", "three", "zero", "nine")),
                Arguments.of(Optional.of("THREE"), List.of("one", "three", "ten")),
                Arguments.of(Optional.of(""), List.of(""))

        );
    }


    @ParameterizedTest
    @MethodSource("parameters")
    void shift(Optional<String> oExpected, List<String> input) {
        Optional<String> oResult = finder.find(input);
        Assertions.assertTrue(oResult.isPresent());
        assertEquals(oExpected.get(), oResult.get());

    }

}
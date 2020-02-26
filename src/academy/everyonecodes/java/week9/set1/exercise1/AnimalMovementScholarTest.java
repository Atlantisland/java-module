package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalMovementScholarTest {
    AnimalMovementScholar scholar = new AnimalMovementScholar();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(Optional.empty(), ""),
                Arguments.of(Optional.empty(), "Sparrow"),
                Arguments.of(Optional.empty(), "Bird"),
                Arguments.of(Optional.of("jump,fly"), "sparrow"),
                Arguments.of(Optional.of("fly,jump,swim,walk"), "bird")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void elaborate(Optional<String> oExpected, String keyword) {
        Optional<String> oResult = scholar.elaborate(keyword);

        assertEquals(oExpected, oResult);
    }


}
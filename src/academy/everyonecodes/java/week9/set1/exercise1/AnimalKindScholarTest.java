package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalKindScholarTest {
    AnimalKindScholar elaborator = new AnimalKindScholar();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("mammal", "dog"),
                Arguments.of("bird", "sparrow"),
                Arguments.of("snake, turtle", "reptile"),
                Arguments.of("", "crocodile")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void elaborate(String expected, String keyword) {
        String result = elaborator.elaborate(keyword);

        assertEquals(expected, result);
    }

}
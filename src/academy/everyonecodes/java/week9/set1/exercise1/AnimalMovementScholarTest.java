package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalMovementScholarTest {
    AnimalMovementScholar elaborator = new AnimalMovementScholar();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of("walk", "run"), "dog"),
                Arguments.of(List.of("jump", "fly"), "sparrow"),
                Arguments.of(List.of("crawl", "jump", "swim", "walk"), "amphibian"),
                //Arguments.of(List.of("walk", "jump", "crawl", "swim"), "amphibian"),
                Arguments.of(List.of(), "crocodile")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void elaborate(List<String> expected, String keyword) {
        List<String> result = elaborator.elaborate(keyword);

        assertEquals(expected, result);
    }

}
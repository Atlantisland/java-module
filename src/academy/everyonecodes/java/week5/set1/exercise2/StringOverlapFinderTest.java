package academy.everyonecodes.java.week5.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.util.Optional;

class StringOverlapFinderTest {

    StringOverlapFinder overlapFinder = new StringOverlapFinder();

    @ParameterizedTest
    @CsvSource({
            "el, michael, elias",
            "in, mountain, inside",
            "y, party, year",
            "a, a, a",
            "my, my, myPhone"
    })
    void find(String expected, String first, String second) {
        Optional<String> oResult = overlapFinder.find(first, second);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @ParameterizedTest
    @CsvSource({
            "car, mobile",
            "frame, bottle",
            "'', something",
            "abc, ''",
            "a, b",
    })
    void findReturnsEmptyOptionalFor(String first, String second) {
        Optional<String> oResult = overlapFinder.find(first, second);

        Assertions.assertTrue(oResult.isEmpty());
    }

}
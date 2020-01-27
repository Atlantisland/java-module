package academy.everyonecodes.java.week5.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class LetterPositionFinderTest {
    LetterPositionFinder finder = new LetterPositionFinder();

    @ParameterizedTest
    @CsvSource({
            "0, word, w",
            "2, peace of cake, a",
            "6, let's do it!, d"
    })
    void findReturnsPosition(int expected, String word, String letter) {
        Optional<Integer> oResult = finder.find(word, letter);

        Assertions.assertTrue(oResult.isPresent());
        int result = oResult.get();
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "word, a",
            "'', b",
            "let's do it, b",
    })
    void findReturnsEmpty(String word, String letter) {
        Optional<Integer> oResult = finder.find(word, letter);

        Assertions.assertTrue(oResult.isEmpty());
    }
}
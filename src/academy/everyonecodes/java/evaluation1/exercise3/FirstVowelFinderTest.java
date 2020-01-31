package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FirstVowelFinderTest {
    FirstVowelFinder finder = new FirstVowelFinder();

    @ParameterizedTest
    @CsvSource({
            "a, handout",
            "e, theory",
            "U, Use"
    })
    void findReturnsOptionalOf(String expected, String input) {
        Optional<String> oResult = finder.find(input);

        Assertions.assertTrue(oResult.isPresent());
        String result = oResult.get();
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "'', ''",
            "'', dcdkp",
    })
    void findReturnsEmptyOptional(String input) {
        Optional<String> oResult = finder.find(input);

        Assertions.assertTrue(oResult.isEmpty());
    }


}

package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCapitalizerTest {

    StringCapitalizer capitalizer = new StringCapitalizer();

    @ParameterizedTest
    @CsvSource({
            "Hello, hello",
            "Hello, ' hello '",
            "Great, great"
    })
    void capitalize(String expected, String input) {
        String result = capitalizer.capitalize(input);
        Assertions.assertEquals(expected, result);

    }


}
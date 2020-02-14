package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ForkTest {
    Fork fork = new Fork();

    @Test
    void getName() {
        String result = fork.getName();

        String expected = "fork";
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "true, Fish",
            "true, Pizza",
            "false,Soup",

    })
    void isUsedFor(boolean expected, String input) {
        boolean result = fork.isUsedFor(input);

        assertEquals(expected, result);
    }

}
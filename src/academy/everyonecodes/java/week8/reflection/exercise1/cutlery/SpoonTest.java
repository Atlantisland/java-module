package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SpoonTest {
    Spoon spoon = new Spoon();

    @Test
    void getName() {
        String result = spoon.getName();

        String expected = "spoon";
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "true, Soup",
            "false, Pizza",
            "false, Pasta",

    })
    void isUsedFor(boolean expected, String input) {
        boolean result = spoon.isUsedFor(input);

        assertEquals(expected, result);
    }

}
package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class KnifeTest {
    Knife knife = new Knife();

    @Test
    void getName() {
        String result = knife.getName();

        String expected = "knife";
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "true, Fish",
            "true, Pizza",
            "false,Soup",

    })
    void isUsedFor(boolean expected, String input) {
        boolean result = knife.isUsedFor(input);

        assertEquals(expected, result);
    }

}
package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SpoonTest {
    Cutlery cutlery = new Spoon();

    @Test
    void getName() {
        String result = cutlery.getName();

        String expected = "Spoon";
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "false, ''",
            "false, soup",
            "false, fish",
            "true, Soup",
    })
    void isUsedFor(boolean expected, String food) {
        boolean result = cutlery.isUsedFor(food);

        assertEquals(expected, result);
    }

}
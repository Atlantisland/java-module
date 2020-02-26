package academy.everyonecodes.java.week8.reflection.exercise1.cutlery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class KnifeTest {
    Cutlery cutlery = new Knife();

    @Test
    void getName() {
        String result = cutlery.getName();

        String expected = "Knife";
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "false, ''",
            "false, soup",
            "false, fish",
            "false, pizza",
            "true, Fish",
            "true, Pizza",
    })
    void isUsedFor(boolean expected, String food) {
        boolean result = cutlery.isUsedFor(food);

        assertEquals(expected, result);
    }


}
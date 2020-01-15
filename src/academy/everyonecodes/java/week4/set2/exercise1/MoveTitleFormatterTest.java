package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MoveTitleFormatterTest {
    MoveTitleFormatter formater = new MoveTitleFormatter();

    @ParameterizedTest
    @CsvSource({
            "Home Alone, home alone",
            "Dumb And Dumber, dumb and dumber",
            "'', ''"

    })
    void format(String expected, String input) {
        String result = formater.format(input);
        Assertions.assertEquals(expected, result);
    }

}
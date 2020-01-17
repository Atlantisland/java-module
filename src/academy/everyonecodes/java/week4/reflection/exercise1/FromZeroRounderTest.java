package academy.everyonecodes.java.week4.reflection.exercise1;

import academy.everyonecodes.java.week4.set1.exercise4.FilmCharacter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FromZeroRounderTest {

    FromZeroRounder rounder = new FromZeroRounder();

    @ParameterizedTest
    @CsvSource({
            "-2, -1.2",
            "2, 1.2",
            "0.0, 0.0"
    })
    void round(double expected, double input) {
        Double result = rounder.round(input);

        Assertions.assertEquals(expected, result);
    }
}


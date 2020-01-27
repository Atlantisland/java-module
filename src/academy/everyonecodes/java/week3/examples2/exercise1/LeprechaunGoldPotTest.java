package academy.everyonecodes.java.week3.examples2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LeprechaunGoldPotTest {

    LeprechaunGoldPot leprechaunGoldPot = new LeprechaunGoldPot();

    @ParameterizedTest
    @CsvSource({
            "100, 9",
            "100, 10",
            "1, 11"
    })
    void countGoldPieces(int expected, int input) {
        int result = leprechaunGoldPot.countGoldPieces(input);
        Assertions.assertEquals(expected, result);
    }

}
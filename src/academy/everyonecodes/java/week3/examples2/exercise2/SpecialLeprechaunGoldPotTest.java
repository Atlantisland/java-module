package academy.everyonecodes.java.week3.examples2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SpecialLeprechaunGoldPotTest {

    SpecialLeprechaunGoldPot specialLeprechaunGoldPot = new SpecialLeprechaunGoldPot();

    @ParameterizedTest
    @CsvSource({
            "0, 99, false",
            "0, 99, true",
            "0, 100, false",
            "1000, 100, true"

    })
    void countGoldPieces(int expected, int age, boolean hasNeverHarmed) {
        int result = specialLeprechaunGoldPot.countGoldPieces(age, hasNeverHarmed);

        Assertions.assertEquals(expected, result);
    }

}
package academy.everyonecodes.java.week3.examples1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeprechaunGoldPotTest {

    LeprechaunGoldPot leprechaunGoldPot = new LeprechaunGoldPot();

    @Test
    void getGoldPieces() {
        int result = leprechaunGoldPot.getGoldPieces();

        int expected = 5;
        Assertions.assertEquals(expected, result);
    }

}
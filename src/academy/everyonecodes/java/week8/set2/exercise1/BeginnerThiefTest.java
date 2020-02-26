package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeginnerThiefTest {

    Thief thief = new BeginnerThief();

    @ParameterizedTest
    @CsvSource({
            "1, 2",
            "0, 1",
            "-1, 0",
    })
    void open(int after, int before) {
        Safe safe = new Safe("Basic", before);

        thief.open(safe);

        Safe expected = new Safe("Basic", after);
        assertEquals(expected, safe);
    }
}
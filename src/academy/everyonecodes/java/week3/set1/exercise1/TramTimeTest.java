package academy.everyonecodes.java.week3.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TramTimeTest {

    TramTime tramTime = new TramTime();

    @Test
    void calculateTramTime() {
        int inputNumberOfStations = 3;

        int result = tramTime.calculateTramTime(inputNumberOfStations);

        int expected = 12;
        Assertions.assertEquals(expected, result);
    }
}
package academy.everyonecodes.java.evaluationTwo.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Antenna3GTest {
    RadioAntenna radioAntenna = new Antenna3G();

    @Test
    void getFrequency() {
        int result = radioAntenna.getFrequency();
        int expected = 1900;
        Assertions.assertEquals(expected, result);
    }

}

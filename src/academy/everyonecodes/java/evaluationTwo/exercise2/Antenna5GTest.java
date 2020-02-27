package academy.everyonecodes.java.evaluationTwo.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Antenna5GTest {
    RadioAntenna radioAntenna = new Antenna5G();

    @Test
    void getFrequency() {
        int result = radioAntenna.getFrequency();
        int expected = 4200;
        Assertions.assertEquals(expected, result);
    }

}
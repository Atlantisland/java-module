package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderRatioCalculatorTest {
    GenderRatioCalculator calculator = new GenderRatioCalculator();

    @Test
    void calculate() {
        String result = calculator.calculate();
        String expected = "Gender ratio: " + 518 + " : " + 482;
        Assertions.assertEquals(expected, result);
    }

}




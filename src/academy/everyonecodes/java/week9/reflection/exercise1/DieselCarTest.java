package academy.everyonecodes.java.week9.reflection.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieselCarTest {

    DieselCar describer = new DieselCar("Mini Cooper");

    @Test
    void describe() {
        String result = describer.describe();

        String expected = "I am a Mini Cooper car!";
        assertEquals(expected, result);
    }

}
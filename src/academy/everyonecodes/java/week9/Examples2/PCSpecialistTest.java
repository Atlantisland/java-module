package academy.everyonecodes.java.week9.Examples2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PCSpecialistTest {

    PCSpecialist specialist = new PCSpecialist("Rick McQuick");

    @Test
    void introduce() {
        String result = specialist.introduce();

        String expected = "Hello, my name is Rick McQuick";
        assertEquals(expected, result);
    }

    @Test
    void describeWork() {
        String result = specialist.describeWork();

        String expected = "I will now fix your computer.";
        assertEquals(expected, result);
    }
}
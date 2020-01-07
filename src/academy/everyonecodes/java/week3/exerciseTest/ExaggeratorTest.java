package academy.everyonecodes.java.week3.exerciseTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExaggeratorTest {

    Exaggerator exaggerator = new Exaggerator();

    @Test
    void exaggerate() {
        String input = "ice-cream";

        String result = exaggerator.exaggerate(input);

        String expected = "ice-cream!";
        Assertions.assertEquals(expected, result);
    }
}
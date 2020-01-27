package academy.everyonecodes.java.week5.filesExamples.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalCounterTest {
    AnimalCounter counter = new AnimalCounter();


    @Test
    void counterReturnsThree() {
        int result = counter.count();

        int expected = 3;
        Assertions.assertEquals(expected, result);

    }
}
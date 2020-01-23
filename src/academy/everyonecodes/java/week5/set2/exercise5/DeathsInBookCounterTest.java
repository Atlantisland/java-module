package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeathsInBookCounterTest {
    DeathsInBookCounter counter = new DeathsInBookCounter();

    @Test
    void countEmpty() {
        List<Character> input = List.of();
        String book = "3";
        int result = counter.count(input, book);
        int expected = 0;

        Assertions.assertEquals(expected, result);
    }
}
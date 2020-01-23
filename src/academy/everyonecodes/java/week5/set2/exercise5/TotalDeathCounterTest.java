package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class TotalDeathCounterTest {
    TotalDeathCounter counter = new TotalDeathCounter();

    @Test
    void countTest() {
        List<Character> input = List.of();
        int result = counter.count(input);
        int expected = 0;

        Assertions.assertEquals(expected, result);
    }
}
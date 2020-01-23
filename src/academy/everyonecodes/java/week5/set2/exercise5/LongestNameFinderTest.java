package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;


class LongestNameFinderTest {
    LongestNameFinder finder = new LongestNameFinder();
    Character character = new Character(" Aegon Targaryen", "", "Male");

    @Test
    void findTest() {
        List<Character> input = List.of();
        Optional<Character> oResult = finder.find(input);
        Optional<Character> oExpected = Optional.of(character);

        Assertions.assertTrue(oResult.isEmpty());
    }
}
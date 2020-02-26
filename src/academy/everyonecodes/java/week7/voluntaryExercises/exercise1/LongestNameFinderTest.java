package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class LongestNameFinderTest {
    LongestNameFinder finder = new LongestNameFinder();

    @Test
    void find() {
        Optional<String> result = finder.find();
        Assertions.assertTrue(result.isPresent());
        String name = result.get();
        String expected = "CharizardMega Charizard X";
        Assertions.assertEquals(expected, name);
    }

}
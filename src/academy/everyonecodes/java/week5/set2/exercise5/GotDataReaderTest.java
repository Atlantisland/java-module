package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class GotDataReaderTest {
    GotDataReader reader = new GotDataReader();

    @Test
    void read() {
        List<Character> result = reader.read();

        Character expected = getExpectedCharacter();
        Character first = result.get(0);
        assertEquals(expected, first);
    }

    private void assertEquals(Character expected, Character first) {
        Assertions.assertEquals(expected.getName(), first.getName());
        Assertions.assertEquals(expected.getBookOfDeath(), first.getBookOfDeath());
        Assertions.assertEquals(expected.getGender(), first.getGender());
    }

    private Character getExpectedCharacter() {
        return new Character(
                "Addam Marbrand",
                Optional.empty(),
                "1"
        );
    }

}
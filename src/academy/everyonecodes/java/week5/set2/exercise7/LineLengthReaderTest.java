package academy.everyonecodes.java.week5.set2.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineLengthReaderTest {
    LineLengthReader reader = new LineLengthReader();
    String input = "src/academy/everyonecodes/java/week5/set2/files/strings.txt";

    @Test
    void readTestOne() {
        List<Integer> result = reader.read();
        String expected = "Eros tortor suspendisse tristique faucibus, turpis non dis.";
        int expectedPosition = expected.length();
        Assertions.assertEquals(expectedPosition, result.get(1));
    }
}
package academy.everyonecodes.java.week5.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class LoremIpsumReaderTest {
    LoremIpsumReader reader = new LoremIpsumReader();

    @Test
    void readAPart(){
        String input = "src/academy/everyonecodes/java/week5/set2/files/lorem-ipsum.txt";

        List<String> result = reader.read();

        String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

        Assertions.assertTrue(result.contains(expected));

    }

}

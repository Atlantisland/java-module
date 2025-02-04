package academy.everyonecodes.java.week5.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class LoremIpsumReaderTest {
    LoremIpsumReader reader = new LoremIpsumReader();

    @Test
    void readAPart(){
        List<String> expected = List.of("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.",
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");


        List<String> result = reader.read();

        Assertions.assertLinesMatch(expected, result);

    }

}

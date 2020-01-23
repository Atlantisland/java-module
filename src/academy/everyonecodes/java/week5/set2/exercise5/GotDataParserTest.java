package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GotDataParserTest {
    GotDataParser parser = new GotDataParser();

    @Test
    void parseLineTest() {
        String input = "Addam Marbrand;Lannister;;;;56;1;1;1;1;1;1;0";
        Character expected = new Character("Addam Marbrand", "", "male");
        Character result = parser.parseLine(input).get();
        Assertions.assertEquals(expected.getName(), result.getName());

    }
}
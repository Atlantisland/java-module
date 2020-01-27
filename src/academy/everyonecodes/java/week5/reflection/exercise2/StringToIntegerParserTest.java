package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerParserTest {
    StringToIntegerParser parser = new StringToIntegerParser();

    @Test
    void parseReturnsValueForSingleEntry() {
        String input = "4";

        List<Integer> result = parser.parse(input);

        List<Integer> expected = List.of(4);
        Assertions.assertEquals(expected, result);

    }

    @Test
    void parseReturnsValuesForNegativeAndPostiveEntries() {
        String input = "-1;-3;5";

        List<Integer> result = parser.parse(input);

        List<Integer> expected = List.of(-1, -3, 5);
        Assertions.assertEquals(expected, result);

    }

    @Test
    void parseReturnsValuesForMultipleEntries() {
        String input = "1;2;3;4";

        List<Integer> result = parser.parse(input);

        List<Integer> expected = List.of(1, 2, 3, 4);
        Assertions.assertEquals(expected, result);

    }
}
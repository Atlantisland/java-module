package academy.everyonecodes.java.week4.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringAsIntegerListPapserTest {
    StringAsIntegerListPapser parser = new StringAsIntegerListPapser();

    @Test
    void parseFirst() {
        List<Integer> result = parser.parse("1;2;3");

        List<Integer> expected = List.of(1, 2, 3);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void parseSecond() {
        List<Integer> result = parser.parse("11;22;33");

        List<Integer> expected = List.of(11, 22, 33);
        Assertions.assertEquals(expected, result);
    }
    @Test
    void parseThird() {
        List<Integer> result = parser.parse("0;0;7");

        List<Integer> expected = List.of(0, 0, 7);
        Assertions.assertEquals(expected, result);
    }


}

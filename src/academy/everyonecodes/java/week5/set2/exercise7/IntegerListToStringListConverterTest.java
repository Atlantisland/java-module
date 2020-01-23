package academy.everyonecodes.java.week5.set2.exercise7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListToStringListConverterTest {
    IntegerListToStringListConverter converter = new IntegerListToStringListConverter();

    @Test
    void convertTestOne() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        List<String> result = converter.convert(input);

        List<String> expected = List.of("1", "2", "3", "4", "5");

        Assertions.assertEquals(expected, result);

    }

    @Test
    void convertTwo() {
        List<Integer> input = List.of(-1, 2, -3, -4, 5);
        List<String> result = converter.convert(input);

        List<String> expected = List.of("-1", "2", "-3", "-4", "5");

        Assertions.assertEquals(expected, result);

    }

    @Test
    void convertThree() {
        List<Integer> input = List.of();
        List<String> result = converter.convert(input);

        List<String> expected = List.of();

        Assertions.assertEquals(expected, result);

    }

}
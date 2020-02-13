package academy.everyonecodes.java.optionals.maps.exercise1;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StringsToLenghtMapperTest {
    StringsToLenghtMapper mapper = new StringsToLenghtMapper();

    @Test
    void testMapOne() {
        List<String> strings = Arrays.asList("hi", "there");

        Map<String, Integer> map = mapper.map(strings);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("hi", 2);
        expected.put("there", 5);
        assertEquals(map, expected);
    }

    @Test
    void testMapTwo() {
        List<String> strings = Arrays.asList("a", "A");

        Map<String, Integer> map = mapper.map(strings);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("A", 1);
        assertEquals(map, expected);
    }

    @Test
    void testMapThree() {
        List<String> strings = Arrays.asList("23", "1");

        Map<String, Integer> map = mapper.map(strings);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("23", 2);
        expected.put("1", 1);
        assertEquals(map, expected);
    }

    @Test
    void testMapFour() {
        List<String> strings = Arrays.asList("", " ");

        Map<String, Integer> map = mapper.map(strings);

        Map<String, Integer> expected = new HashMap<>();
        expected.put("", 0);
        expected.put(" ", 1);
        assertEquals(map, expected);
    }

}
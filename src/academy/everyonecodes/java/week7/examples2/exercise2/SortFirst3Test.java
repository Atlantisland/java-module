package academy.everyonecodes.java.week7.examples2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortFirst3Test {

    @Test
    void test() {
        Stream<Integer> numbers = Stream.of(75, 81, 87, 81, 51, 34, 51, 75, 61, 59, 53, 97, 40, 92, 21);

        List<Integer> result = numbers
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());

        List<Integer> expected = List.of(97, 92, 87);
        Assertions.assertEquals(expected, result);
    }
}

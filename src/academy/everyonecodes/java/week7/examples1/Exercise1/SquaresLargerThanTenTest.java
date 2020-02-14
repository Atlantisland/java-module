package academy.everyonecodes.java.week7.examples1.Exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class SquaresLargerThanTenTest {

    @Test
    void test() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()
                .map(number -> number * number)
                .filter(number -> number > 10)
                .collect(Collectors.toList());

        List<Integer> expected = List.of(16, 25);
        Assertions.assertEquals(expected, result);
    }
}

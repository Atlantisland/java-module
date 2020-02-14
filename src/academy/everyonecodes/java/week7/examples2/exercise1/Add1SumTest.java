package academy.everyonecodes.java.week7.examples2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class Add1SumTest {

    @Test
    void test() {
        List<Integer> numbers = List.of(-3, -2, -1, 0, 1, 2, 3);

        Optional<Integer> oResult = numbers.stream()
                .filter(number -> 0 <= number)
                .map(number -> number + 1)
                .reduce(Integer::sum);

        Assertions.assertTrue(oResult.isPresent());
        int expected = 10;
        Assertions.assertEquals(expected, oResult.get());
    }
}

package academy.everyonecodes.java.week7.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;


public class RoundDownToAbsoluteBiggerThan1Test {

    @Test
    void test() {
        List<Double> numbers = List.of(1.5, -1.8, 3.5);

        Optional<Double> result = numbers.stream()
                .map(number -> Math.floor(number))
                .map(number -> Math.abs(number))
                .filter(number -> number > 1.0)
                .findFirst();

        double expected = 2.0;
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(expected, result.get());


    }
}

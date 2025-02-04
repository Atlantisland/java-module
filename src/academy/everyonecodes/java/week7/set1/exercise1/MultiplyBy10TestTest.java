package academy.everyonecodes.java.week7.set1.exercise1;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyBy10TestTest {

    @Test
    void test() {
        List<Integer> numbers = List.of(-2, -1, 0, 1, 2);

        List<Integer> result = numbers.stream()
                .map(number -> number*10)
                .collect(Collectors.toList());

        List<Integer> expected = List.of(-20, -10, 0, 10, 20);
        Assertions.assertEquals(expected, result);


    }

}
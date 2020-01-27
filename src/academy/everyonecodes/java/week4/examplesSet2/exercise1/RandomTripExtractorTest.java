package academy.everyonecodes.java.week4.examplesSet2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomTripExtractorTest {

    RandomTripExtractor sorter = new RandomTripExtractor();

    @Test
    void extractReturnsThreeFromList() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> result = sorter.extract(numbers);
        List<Integer> expected = List.of(9, 3, 4);

        Assertions.assertEquals(3, result.size());
        for (int number : result) {
            Assertions.assertTrue(numbers.contains(number));
        }

    }
}

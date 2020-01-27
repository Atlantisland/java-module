package academy.everyonecodes.java.week4.examplesSet2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class IntegerListDescendingSorterTest {
    IntegerListDescendingSorter sorter = new IntegerListDescendingSorter();

    @Test
    void sortReturnEmptyListForEmptyList() {
        List<Integer> integers = List.of();

        List<Integer> result = sorter.sort(integers);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void sortReturnsSameistForListWithOneEntry() {
        List<Integer> integers = List.of(5);

        List<Integer> result = sorter.sort(integers);

        List<Integer> expected = List.of(5);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void sortReturnsSortedListForRegularList() {
        List<Integer> integers = List.of(4, 6, 2, 7);

        List<Integer> result = sorter.sort(integers);

        List<Integer> expected = List.of(7, 6, 4, 2);
        Assertions.assertEquals(expected, result);
    }

}
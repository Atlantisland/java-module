package academy.everyonecodes.java.week3.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReversableTest {
    Reversable reversable = new Reversable();

    @Test
    void reverse() {
        List<Integer> inputElements = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));

        List<Integer> result = reversable.reverse(inputElements);

        List<Integer> expected = new ArrayList<>(List.of(7, 6, 5, 4, 3, 2, 1));
        Assertions.assertEquals(expected, result);

    }

}
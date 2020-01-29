package academy.everyonecodes.java.week6.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegersLeftsShifterTest {
    IntegersLeftsShifter shifter = new IntegersLeftsShifter();

    @Test
    void shiftEmptyList(){
        List<Integer> input = List.of();
        List<Integer> copyInput = new ArrayList<>(input);
        shifter.shiftOne(copyInput);
        List<Integer> result = List.of();
        List<Integer> copyExpected = new ArrayList<>(copyInput);
        Assertions.assertEquals(copyExpected, result);
    }

    @Test
    void shift(){
        List<Integer> input = List.of(1, 2, 3, 4);
        List<Integer> copyInput = new ArrayList<>(input);
        shifter.shiftOne(copyInput);
        List<Integer> expected = List.of(2, 3, 4, 1);
        List<Integer> copyExpected = new ArrayList<>(expected);
        Assertions.assertEquals(copyExpected, copyInput);
    }

}

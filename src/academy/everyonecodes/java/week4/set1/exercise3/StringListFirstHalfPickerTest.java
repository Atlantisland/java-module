package academy.everyonecodes.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListFirstHalfPickerTest {
    StringListFirstHalfPicker stringListFirstHalfPicker = new StringListFirstHalfPicker();

    @Test
    void pick() {
        List<String> input = List.of("cat", "dog", "mouse", "fox", "wolf");
        List<String> expected = List.of("cat", "dog");
        String result = stringListFirstHalfPicker.pick(input);
        System.out.println(result);
        Assertions.assertTrue(expected.contains(result));

    }
}

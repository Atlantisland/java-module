package academy.everyonecodes.java.week4.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListSecondHalfPickerTest {
    StringListSecondHalfPicker stringListSecondHalfPicker = new StringListSecondHalfPicker();

    @Test
    void pick() {
        List<String> input = List.of("cat", "dog", "mouse", "fox", "wolf");
        List<String> expected = List.of("mouse", "fox", "wolf");
        String result = stringListSecondHalfPicker.pick(input);
        System.out.println(result);
        Assertions.assertTrue(expected.contains(result));

    }
}


package academy.everyonecodes.java.week6.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpecialNumbersCounterTest {
    SpecialNumbersCounter counter = new SpecialNumbersCounter();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1, 3",
            "1, 6",
            "1, 9",
            "1, 130",
            "2, 13060",
            "3, 10306090",
    })

    void count(int expected, int input){
        int result = counter.count(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getDigitsLength1() {
        int number = 0;

        List<String> result = counter.getDigits(number);

        List<String> expected = List.of("0");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getDigitsLength2() {
        int number = 10;

        List<String> result = counter.getDigits(number);

        List<String> expected = List.of("1", "0");
        Assertions.assertEquals(expected, result);
    }


}
package academy.everyonecodes.java.week6.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SpecialNumbersCounterTest {
    SpecialNumbersCounter counter = new SpecialNumbersCounter();

    @ParameterizedTest
    @CsvSource({
            "4, 530936",
            "1, 53",
            "0, 28"
    })

    void count(int expected, int input){
        int result = counter.count(input);
        Assertions.assertEquals(expected, result);
    }

}
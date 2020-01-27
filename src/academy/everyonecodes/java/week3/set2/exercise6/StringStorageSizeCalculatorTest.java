package academy.everyonecodes.java.week3.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringStorageSizeCalculatorTest {
    StringStorageSizeCalculator stringStorageSizeCalculator = new StringStorageSizeCalculator();

    @ParameterizedTest
    @CsvSource({
            "112, Hallo",
            "112, 'Hallo'",
            "144, ' Hallo '",
            "128, ' hallo'"
    })

    void calculate(int expected, String input) {
        int result = stringStorageSizeCalculator.calculate(input);

        Assertions.assertEquals(expected, result);

    }
}
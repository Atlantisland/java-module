package academy.everyonecodes.java.week3.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MileToKilometerConverterTest {
    MileToKilometerConverter mileToKilometerConverter = new MileToKilometerConverter();

    @ParameterizedTest
    @CsvSource({
            "160.93439798947875, 100",
            "161.73906997942615, 100.50",
            "-161.73906997942615, -100.50"
    })

    void convert(double expected, double input) {
        double result = mileToKilometerConverter.convert(input);

        Assertions.assertEquals(expected, result);
    }
}
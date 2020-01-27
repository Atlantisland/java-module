package academy.everyonecodes.java.week3.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class KilometerToMileConverterTest {
    KilometerToMileConverter kilometerToMileConverter = new KilometerToMileConverter();

    @ParameterizedTest
    @CsvSource({
            "20.194564, 32.5",
            "19.8838784, 32",
            "-19.8838784, -32"
    })

    void convert(double expected, double input) {
        double result = kilometerToMileConverter.convert(input);

        Assertions.assertEquals(expected, result);
    }
}
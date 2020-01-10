package academy.everyonecodes.java.week3.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PoundToEuroConverterTest {

    PoundToEuroConverter poundToEuroConverter = new PoundToEuroConverter();

    @ParameterizedTest
    @CsvSource({
            "6.588235294117647, 5.6",
            "4.7, 3.995",
            "9, 7.65"

    })
    void convert(double expected, double input) {
        double result = poundToEuroConverter.convert(input);

        Assertions.assertEquals(expected, result);
    }
}


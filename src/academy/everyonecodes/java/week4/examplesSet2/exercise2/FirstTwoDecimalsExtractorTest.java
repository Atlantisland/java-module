package academy.everyonecodes.java.week4.examplesSet2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FirstTwoDecimalsExtractorTest {
    FirstTwoDecimalsExtractor extractor = new FirstTwoDecimalsExtractor();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "34, 0.34",
            "10, 0.1",
    })
    void extract(double expected, double value) {
        double result = extractor.extract(value);

        Assertions.assertEquals(expected, result);
    }

}
package academy.everyonecodes.java.week4.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BeforeDashExtractorTest {
    BeforeDashExtractor extractor = new BeforeDashExtractor();

    @ParameterizedTest
    @CsvSource({
            "my, my-string",
            "Some, Some-example",
            "hallo world, hallo world-again"
    })
    void extract(String expected, String input) {
        String result = extractor.extract(input);

        Assertions.assertEquals(expected, result);
    }

}


//no time to write my method
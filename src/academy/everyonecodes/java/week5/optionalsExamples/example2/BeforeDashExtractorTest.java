package academy.everyonecodes.java.week5.optionalsExamples.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class BeforeDashExtractorTest {
    BeforeDashExtractor extractor = new BeforeDashExtractor();

    @ParameterizedTest
    @CsvSource({
            "my, my-string",
            "Some, Some-example",
            ", "
    })
    void extract(String expected, String input){
        Optional<String> oResult = extractor.extract(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }

    @ParameterizedTest
    @CsvSource({
            "noDash",
            "''",
    })
    void extractReturnsEmptyOptionalFor(String input) {
        Optional<String> oResult = extractor.extract(input);

        Assertions.assertTrue(oResult.isEmpty());
    }

}
package academy.everyonecodes.java.week4.exampleSet1.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DateExtractorTest {
    DateExtractor dateExtractor = new DateExtractor();

    @ParameterizedTest
    @CsvSource({
            "10012020, PHOTO_10012020.png",
            "10012020, PHOTO_10012020.png",
            "'', PHOTO_.png",
    })
    void extract(String expected, String fileName) {
        String result = dateExtractor.extract(fileName);

        Assertions.assertEquals(expected, result);
    }

}
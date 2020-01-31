package academy.everyonecodes.java.evaluation1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class PictureNameExtractorTest {
    PictureNameExtractor extractor = new PictureNameExtractor();

    @ParameterizedTest
    @CsvSource({
            "sunshine, 01222013SunshinePic.jpg",
            "snowflake, 24122019SnowflakePic.jpg",
            "dereks birthday, 01082003Dereks-BirthdayPic.jpg",
            "'' , 01222013Pic.jpg"

    })
    void extract(String expected, String input) {
        String result = extractor.extract(input);
        Assertions.assertEquals(expected, result);

    }

}
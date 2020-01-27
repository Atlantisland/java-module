package academy.everyonecodes.java.week4.exampleSet1.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FileNameValidatorTest {
    FileNameValidator fileNameValidator = new FileNameValidator();

    @ParameterizedTest
    @CsvSource({
            "true, PHOTO_.png",
            "true, PHOTO_something.png",
            "false, PHOTO.png",
            "false, PHOTO_png",
            "false, somephoto.png",
            "false, PHOTO_invalid.jpg"
    })
    void validate(boolean expected, String filename) {
        boolean result = fileNameValidator.validate(filename);

        Assertions.assertEquals(expected, result);
    }
}
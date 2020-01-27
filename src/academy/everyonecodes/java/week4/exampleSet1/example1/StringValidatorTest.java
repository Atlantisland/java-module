package academy.everyonecodes.java.week4.exampleSet1.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringValidatorTest {
    StringValidator stringValidator = new StringValidator();

    @ParameterizedTest
    @CsvSource({
            "false, ''",
            "false, ' '",
            "true, something",
            "false, '/n'",
            "true, something else",
    })
    void validate(boolean expected, String value) {
        boolean result = stringValidator.validate(value);

        Assertions.assertEquals(expected, result);
    }
}
package academy.everyonecodes.java.week4.set1.exercise1;

import academy.everyonecodes.java.christmas.exercise2.TotalTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PngCheckerTest {
    PngChecker pngChecker = new PngChecker();

    // @Test
    // void check() {
    // String input = ".pNg";

    // boolean result = pngChecker.checker(input);

    //boolean expected = false;
    //Assertions.assertEquals(expected, result);

    @ParameterizedTest
    @CsvSource({
            "true, .PNG",
            "true, .pNg",
            "false, photo"
    })
    void checker(boolean expected, String input) {
        boolean result = pngChecker.checker(input);
        Assertions.assertEquals(expected, result);


    }

}



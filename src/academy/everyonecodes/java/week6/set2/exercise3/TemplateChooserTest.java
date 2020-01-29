package academy.everyonecodes.java.week6.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TemplateChooserTest {
    TemplateChooser chooser = new TemplateChooser();

    @ParameterizedTest
    @CsvSource({
            "female, Ms.",
            "female, Mrs.",
            "male, Mr.",
            "privileged, Hokopoko",
            "default, Dr."
    })

    void choose(String expected, String input){
        String result = chooser.choose(input);
        Assertions.assertEquals(expected, result);
    }

}
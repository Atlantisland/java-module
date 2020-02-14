package academy.everyonecodes.java.week8.examples1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PhraseModifierTest {
    PhraseModifier modifier = new PhraseModifier();

    @ParameterizedTest
    @CsvSource({
            "' ', ''",
            "'  ', ' '",
            "'A ', 'a'",
            "'  A ', ' a'",

    })
    void modify(String expected, String text) {
        Phrase phrase = new Phrase(text, "Author");

        modifier.modify(phrase);

        assertEquals(expected, phrase.getText());
    }

}
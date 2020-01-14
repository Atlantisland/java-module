package academy.everyonecodes.java.week4.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FilmCharacterParserTest {
    FilmCharacterParser filmCharacterParser = new FilmCharacterParser();

    @ParameterizedTest
    @CsvSource({
            "Anakin, Skywalker, Anakin;Skywalker",
            "Frodo, Baggins, Frodo;Baggins",
            "Spongebob, Squarepants, Spongebob;Squarepants"
    })
    void parse(String expectedFirstName, String expectedLastName, String input) {

        FilmCharacter resultingCharacter = filmCharacterParser.parse(input);
        String resultFirstName = resultingCharacter.getFirstName();
        String resultLastName = resultingCharacter.getLastName();

        Assertions.assertEquals(expectedFirstName, resultFirstName);
        Assertions.assertEquals(expectedLastName, resultLastName);

    }

}
package academy.everyonecodes.java.week5.optionalsExamples.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FilmCharacterParserTest {
    FilmCharacterParser parser = new FilmCharacterParser();

    @ParameterizedTest
    @CsvSource({
            "Han, Solo, Han;Solo",
            "Frodo, Baggins, Frodo;Baggins",
            "Anakin, Skywalker, Anakin;Skywalker",
    })
    void parse(String expectedFirst, String expectedSecond, String data) {
        Optional<FilmCharacter> oResult = parser.parse(data);

        Assertions.assertTrue(oResult.isPresent());
        FilmCharacter result = oResult.get();
        Assertions.assertEquals(expectedFirst, result.getFirstName());
        Assertions.assertEquals(expectedSecond, result.getLastName());
    }

    @ParameterizedTest
    @CsvSource({
            "wrongData",
            ";Nameless",
            "Mister;",
    })
    void parseReturnsEmptyOptionalFor(String data) {
        Optional<FilmCharacter> oResult = parser.parse(data);
        Assertions.assertTrue(oResult.isEmpty());
    }
}
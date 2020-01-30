package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ArtistFinderTest {
    ArtistFinder finder = new ArtistFinder();

    @ParameterizedTest
    @CsvSource({
            "Don't stop me now",
            "Bohemian Rhapsody",
    })
    void findForReturnsEmptyOptionalFor(String title) {
        Optional<String> oResult = finder.findFor(title);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @ParameterizedTest
    @CsvSource({
            "Ariana Grande, 7 rings",
            "Bad Bunny, Callaita",
    })
    void findForReturnsArtistFor(String expected, String title) {
        Optional<String> oResult = finder.findFor(title);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }


}


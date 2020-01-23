package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ArtistFinderTest {
    ArtistFinder finder = new ArtistFinder();

    @Test
    void findForTestOne() {
        Optional<String> oResult = finder.findFor("");
        Assertions.assertTrue(oResult.isEmpty());
    }

}

//Due to time limitation I cannot test more
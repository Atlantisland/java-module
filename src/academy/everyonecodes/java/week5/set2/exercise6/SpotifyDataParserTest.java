package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SpotifyDataParserTest {
    SpotifyDataParser parser = new SpotifyDataParser();

    @Test
    void parseLineTestOne() {
        String input = "1;\"Señorita\";\"Shawn Mendes\";\"canadian pop\";117;55;76;-6;8;75;191;4;3;79";
        Optional<Song> oResult = parser.parseLine(input);
        Assertions.assertEquals("Shawn Mendes", oResult.get().getArtist());
    }
}

//Due to time limitation I cannot test more
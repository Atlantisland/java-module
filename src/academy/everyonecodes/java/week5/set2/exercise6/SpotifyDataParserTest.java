package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SpotifyDataParserTest {
    SpotifyDataParser parser = new SpotifyDataParser();

    @ParameterizedTest
    @CsvSource({
            "bad guy, 10, Billie Eilish, 10;\"bad guy\";\"Billie Eilish\";\"electropop\";135;43;70;-11;10;56;194;33;38;95",
            "Happier, 48, Marshmello, 48;\"Happier\";\"Marshmello\";\"brostep\";100;79;69;-3;17;67;214;19;5;88"
    })
    void parseLineReturnsValuesFor(String title, int rank, String artist, String line) {
        Optional<Song> oResult = parser.parseLine(line);

        Assertions.assertTrue(oResult.isPresent());
        Song result = oResult.get();
        Song expected = new Song(title, rank, artist);
        assertSongEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "bad",
            "wrong,amount,of,elements"
    })
    void parseLineReturnsEmptyOptional(String line) {
        Optional<Song> oResult = parser.parseLine(line);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @ParameterizedTest
    @CsvSource({
            "''",
            "bad"
    })
    void parseValuesReturnsEmptyOptionalsFor(String rankString) {
        String title = "Singsong";
        String artist = "Me";

        Optional<Song> oResult = parser.parseValues(title, rankString, artist);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @ParameterizedTest
    @CsvSource({
            "4, 4",
            "23, 23",
    })
    void parseValuesReturnsSongFor(int expectedRank, String rankString) {
        String title = "Singsong";
        String artist = "Me";

        Optional<Song> oResult = parser.parseValues(title, rankString, artist);

        Assertions.assertTrue(oResult.isPresent());
        Song result = oResult.get();
        Song expected = new Song("Singsong", expectedRank, "Me");
        assertSongEquals(expected, result);
    }

    private void assertSongEquals(Song expected, Song actual) {
        Assertions.assertEquals(expected.getTitle(), actual.getTitle());
        Assertions.assertEquals(expected.getRank(), actual.getRank());
        Assertions.assertEquals(expected.getArtist(), actual.getArtist());
    }

}

package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpotifyDataReaderTest {
    SpotifyDataReader reader = new SpotifyDataReader();

    @Test
    void readReturnsCorrectData() {
        List<Song> result = reader.read();

        int expectedSize = 50;
        Assertions.assertEquals(expectedSize, result.size());
        Song expectedFirst = new Song("Señorita", 1, "Shawn Mendes");
        Song resultFirst = result.get(0);
        assertSongEquals(expectedFirst, resultFirst);
        Song expectedLast = new Song("Cross Me (feat. Chance the Rapper & PnB Rock)", 50, "Ed Sheeran");
        Song resultLast = result.get(result.size() - 1);
        assertSongEquals(expectedLast, resultLast);
    }

    private void assertSongEquals(Song expected, Song actual) {
        Assertions.assertEquals(expected.getTitle(), actual.getTitle());
        Assertions.assertEquals(expected.getRank(), actual.getRank());
        Assertions.assertEquals(expected.getArtist(), actual.getArtist());
    }



}

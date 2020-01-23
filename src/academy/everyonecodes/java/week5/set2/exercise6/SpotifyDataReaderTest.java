package academy.everyonecodes.java.week5.set2.exercise6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpotifyDataReaderTest {
    SpotifyDataReader reader = new SpotifyDataReader();

    @Test
    void readTestOne() {
        List<Song> result = reader.read();

        Assertions.assertEquals(47, result.size()-3);

    }


}

//Due to time limitation I cannot test more
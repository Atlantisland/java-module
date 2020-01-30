package academy.everyonecodes.java.week5.set2.exercise6;


import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SpotifyDataReader {
    private FileReader reader = new FileReader();
    private SpotifyDataParser parser = new SpotifyDataParser();
    private String path = "src/academy/everyonecodes/java/week5/set2/files/spotify-top-50.csv";

    List<Song> read() {
        List<String> lines = reader.read(path);
        List<Song> songs = new ArrayList<>();
        for (String line : lines) {
            Optional<Song> oSong = parser.parseLine(line);
            if (oSong.isPresent()) {
                songs.add(oSong.get());
            }
        }
        return songs;
    }

}
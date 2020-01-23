package academy.everyonecodes.java.week5.set2.exercise6;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SpotifyDataReader {
    private String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/spotify-top-50.csv";

    public List<Song> read() {
        Path path = Path.of(contentRootPath);
        List<Song> songs = new ArrayList<>();
        SpotifyDataReader reader = new SpotifyDataReader();
        SpotifyDataParser parser = new SpotifyDataParser();

        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 1; i < lines.size(); i++) {
                Song currentSong = parser.parseLine(lines.get(i)).get();
                songs.add(currentSong);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return songs;

    }
}
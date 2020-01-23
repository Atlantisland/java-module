package academy.everyonecodes.java.week5.set2.exercise6;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SpotifyDataParser {
    public Optional<Song> parseLine(String input) {
        List<String> dataSong = Arrays.asList(input.split(";", -1));
        String title = dataSong.get(1);
        int rank = Integer.valueOf(dataSong.get(0));
        String artist = dataSong.get(2);
        Song currentSong = new Song(title, rank, artist);
        if (dataSong.size() > 3) {
            return Optional.of(currentSong);
        }
        return Optional.empty();

    }

}

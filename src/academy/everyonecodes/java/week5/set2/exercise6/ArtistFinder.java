package academy.everyonecodes.java.week5.set2.exercise6;

import java.util.List;
import java.util.Optional;

public class ArtistFinder {
    public Optional<String> findFor(String songName) {
        SpotifyDataReader reader = new SpotifyDataReader();
        List<Song> songs = reader.read();
        for (Song song : songs) {
            if (song.getTitle().equals(songName)) {
                return Optional.of(song.getArtist());
            }
        }
        return Optional.empty();
    }

}

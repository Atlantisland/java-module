package academy.everyonecodes.java.week5.set2.exercise6;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SpotifyDataParser {
    private int elementsPerLine = 14;
    private int rankIndex = 0;
    private int titleIndex = 1;
    private int artistIndex = 2;

    public Optional<Song> parseLine(String line) {
        List<String> elements = List.of(line.split(";", -1));
        if (elements.size() != elementsPerLine) {
            return Optional.empty();
        }
        return parseValues(elements.get(titleIndex), elements.get(rankIndex), elements.get(artistIndex));
    }

    Optional<Song> parseValues(String title, String rankString, String artist) {
        try {
            int rank = Integer.valueOf(rankString);
            title = removeQuotes(title);
            artist = removeQuotes(artist);
            Song song = new Song(title, rank, artist);
            return Optional.of(song);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    String removeQuotes(String quotedText) {
        return quotedText.replace("\"", "");
    }


}

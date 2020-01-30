package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.ArrayList;
import java.util.List;

public class GotDataReader {
    private FileReader reader = new FileReader();
    private String file = "src/academy/everyonecodes/live/files/got-characters.csv";
    private GotDataParser parser = new GotDataParser();

    public List<Character> read() {
        List<String> lines = reader.read(file);
        removeHeaders(lines);
        return transformIntoCharacters(lines);
    }

    private void removeHeaders(List<String> lines) {
        lines.remove(0);
    }

    private List<Character> transformIntoCharacters(List<String> lines) {
        List<Character> characters = new ArrayList<>();
        for (String line : lines) {
            Character character = parser.parseLine(line);
            characters.add(character);
        }
        return characters;
    }
}

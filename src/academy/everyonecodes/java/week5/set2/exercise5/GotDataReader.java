package academy.everyonecodes.java.week5.set2.exercise5;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GotDataReader {
    private String path = "src/academy/everyonecodes/java/week5/set2/files/got-characters.csv";
    private GotDataReader reader = new GotDataReader();
    private FileReader reader = new FileReader();

    public List<Character> read() {
        List<String> lines = reader.read(path);
        List<Character> characters = new ArrayList<>();
        for (String line : lines) {
            Optional<Character> oCharacter = parser.parseLine(line);
            if (oCharacter.isPresent()) {
                characters.add(oCharacter.get());
            }
        }
        return characters;
    }


}

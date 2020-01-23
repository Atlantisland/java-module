package academy.everyonecodes.java.week5.set2.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GotDataReader {
    private String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/got-characters.csv";
    GotDataReader reader = new GotDataReader();

    public List<Character> read(String contentRootPath) {
        Path path = Path.of(contentRootPath);
        List<Character> characterList = new ArrayList<>();
        GotDataParser gotDataParser = new GotDataParser();

        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 1; i < lines.size(); i++) {
                Character currentCharacter = gotDataParser.parseLine(lines.get(i)).get();
                characterList.add(currentCharacter);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return characterList;

    }


}

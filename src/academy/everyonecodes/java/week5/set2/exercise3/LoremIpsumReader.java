package academy.everyonecodes.java.week5.set2.exercise3;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LoremIpsumReader {
    private String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/lorem-ipsum.txt";
    FileReader reader = new FileReader();

    public List<String> read() {
        Path path = Path.of(contentRootPath);
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}

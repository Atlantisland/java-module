package academy.everyonecodes.java.week5.set2.exercise3;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LoremIpsumReader {
    private String path = "src/academy/everyonecodes/java/week5/set2/files/lorem-ipsum.txt";
    private FileReader reader = new FileReader();

    public List<String> read() {
        return reader.read(path);
    }
}

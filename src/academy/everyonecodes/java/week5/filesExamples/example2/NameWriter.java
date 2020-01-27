package academy.everyonecodes.java.week5.filesExamples.example2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NameWriter {
    private String contentRootPath = "src/academy/everyonecodes/java/week5/examples2/files/newname.txt";

    public void write(String newName) {
        Path path = Path.of(contentRootPath);
        List<String> lines = List.of(newName);
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


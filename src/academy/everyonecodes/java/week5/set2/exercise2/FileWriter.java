package academy.everyonecodes.java.week5.set2.exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileWriter {
    public void write(String fileLocation, List<String> lines) {
        Path path = Path.of(fileLocation);
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void append(String fileLocation, List<String> lines) {
        Path path = Path.of(fileLocation);
        try {
            Files.write(path, lines, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


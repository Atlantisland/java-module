package academy.everyonecodes.java.week5.set2.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileWriter {
    public void write(List<String> lines, String file){
        Path path = Path.of(file);
        try {
            Files.write(path, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

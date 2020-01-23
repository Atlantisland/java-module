package academy.everyonecodes.java.week5.set2.exercise7;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LineLengthReader {
    public List<Integer> read() {
        String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/strings.txt";
        FileReader reader = new FileReader();
        List<String> lines = reader.read(contentRootPath);
        List<Integer> lengths = new ArrayList<>();
        for (String line : lines) {
            lengths.add(line.length());
        }
        return lengths;

    }
}


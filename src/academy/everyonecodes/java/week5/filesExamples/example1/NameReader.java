package academy.everyonecodes.java.week5.filesExamples.example1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class NameReader {

    private String contentRootPath = "src/academy/everyonecodes/java/week5/examples2/files/name.txt";

    public Optional<String> read() {
        Path path = Path.of(contentRootPath);
        try {
            List<String> lines = Files.readAllLines(path);
            return getSingleString(lines);
        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();

        }
    }

    private Optional<String> getSingleString(List<String> lines) {
        if (lines.size() != 1) {
            return Optional.empty();
        } else {
            return Optional.of(lines.get(0));
        }
    }
}

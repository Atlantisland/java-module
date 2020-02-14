package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PokemonFileReader {

    public Stream<String> readLines(String contentRootPath) {
        Path path = Path.of(contentRootPath);
        try {
            return Files.lines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return Stream.empty();
        }

    }
}


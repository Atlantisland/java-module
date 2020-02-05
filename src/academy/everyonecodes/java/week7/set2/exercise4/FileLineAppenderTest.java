package academy.everyonecodes.java.week7.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import academy.everyonecodes.java.week5.set2.exercise2.FileWriter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FileLineAppenderTest {
    FileLineAppender appender = new FileLineAppender();
    StreamFileReader reader = new StreamFileReader();
    String pathInput = "src/academy/everyonecodes/java/week5/set2/files/appendCreating.txt";

    @Test
    void append() {

        String input = "Line One";

        appender.append(pathInput, input);
        Stream<String> result = reader.readLines(pathInput);

        String expected = "Line One";
        Assertions.assertEquals(expected, result.collect(Collectors.joining()));

    }

    @AfterEach
    void deleteAppendFile() {
        try {
            Files.deleteIfExists(Path.of(pathInput));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

package academy.everyonecodes.java.week5.set2.exercise2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


class FileWriterTest {
    FileWriter writer = new FileWriter();
    FileReader reader = new FileReader();


    @Test
    void appendByCreating() {
        String pathInput = "src/academy/everyonecodes/java/week5/set2/files/appendCreating.txt";
        List<String> input = List.of("Line One", "Line Two", "Line Three");

        writer.write(pathInput, input);
        List<String> result = reader.read(pathInput);

        List<String> expected = List.of("Line One", "Line Two", "Line Three");
        Assertions.assertEquals(expected, result);

    }

    @Test
    void appendByReading() {
        String pathInput = "src/academy/everyonecodes/java/week5/set2/files/appendCreating.txt";
        List<String> input = List.of("Line Four", "Line Five", "Line Six");

        writer.write(pathInput, input);
        List<String> result = reader.read(pathInput);

        List<String> expected = List.of("Line Four", "Line Five", "Line Six");
        Assertions.assertEquals(expected, result);

    }

    @AfterEach
    void deleteAppendFile() {
        Path path = Path.of("src/academy/everyonecodes/java/week5/set2/files/appendCreating.txt");
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    void write() {
        String pathInput = "src/academy/everyonecodes/java/week5/set2/files/FileWriter.txt";
        List<String> input = List.of("Line One", "Line Two", "Line Three");

        writer.write(pathInput, input);
        List<String> result = reader.read(pathInput);

        List<String> expected = List.of("Line One", "Line Two", "Line Three");
        Assertions.assertEquals(expected, result);

    }


}
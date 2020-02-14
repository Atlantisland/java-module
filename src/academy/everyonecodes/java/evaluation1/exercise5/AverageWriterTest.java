package academy.everyonecodes.java.evaluation1.exercise5;

import academy.everyonecodes.java.evaluation1.commonClasses.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageWriterTest {
    AverageWriter averageWriter = new AverageWriter();
    FileReader reader = new FileReader();

    String pathInput = "src/academy/everyonecodes/java/evaluation1/files/numbers.txt";
    String pathOutput = "src/academy/everyonecodes/java/evaluation1/files/averages.txt";
    String pathOutputExpected = "src/academy/everyonecodes/java/evaluation1/files/averages_expected.txt";

    @Test
    void writer() {
        averageWriter.write(pathInput, pathOutput);

        List<String> expected = reader.read(pathOutputExpected);
        List<String> result = reader.read(pathOutput);

        Assertions.assertEquals(expected, result);

    }

    @AfterEach
    void deleteFile() {
        Path path = Path.of(pathOutput);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
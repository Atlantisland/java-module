package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class DeadCharactersExtractorTest {

    DeadCharactersExtractor extractor = new DeadCharactersExtractor();
    FileReader reader = new FileReader();

    String resultFile = "src/academy/everyonecodes/live/files/deaths.txt";

    @Test
    void extract() {
        extractor.extract();

        String expectedFile = "src/academy/everyonecodes/live/files/deaths_expected.txt";
        List<String> expected = reader.read(expectedFile);
        List<String> result = reader.read(resultFile);
        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    void deleteTempFile() {
        Path path = Path.of(resultFile);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
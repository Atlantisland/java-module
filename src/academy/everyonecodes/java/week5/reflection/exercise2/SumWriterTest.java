package academy.everyonecodes.java.week5.reflection.exercise2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumWriterTest {
    FileReader fileReader = new FileReader();
    SumWriter sumWriter = new SumWriter();

    String path = "src/academy/everyonecodes/java/week5/reflection/files/";

    @Test
    void sum() {
        sumWriter.write();

        String result = path + "output.csv";
        String expected = path + "expected.csv";

        List<String> expectedLines = fileReader.read(expected);
        List<String> resultLines = fileReader.read(result);
        Assertions.assertLinesMatch(expectedLines, resultLines);
    }

    @AfterEach
    private void deleteOutputFile() {
        try {
            Path outputPath = Path.of(path + "output.csv");
            Files.delete(outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
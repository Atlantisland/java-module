package academy.everyonecodes.java.week5.filesExamples.example2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameWriterTest {

    NameWriter writer = new NameWriter();
    FileReader reader = new FileReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/examples2/files/newname.txt";

    @ParameterizedTest
    @CsvSource({
            "Jakob",
            "Marilyn",
            "''"
    })
    void writerCanWriteToFile(String newName) {
        writer.write(newName);

        List<String> result = reader.read(contentRootPath);

        List<String> expected = List.of(newName);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Hannah, Henry",
            "Henry, Lisa",
            "'', ET"
    })
    void writerOverwritesFile(String firstName, String secondName) {
        writer.write(firstName);
        writer.write(secondName);

        List<String> result = reader.read(contentRootPath);

        List<String> expected = List.of(secondName);
        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    void deleteNewNameFile() {
        Path path = Path.of(contentRootPath);
        try {
            Files.deleteIfExists(path);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

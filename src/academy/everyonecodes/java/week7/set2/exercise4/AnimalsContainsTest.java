package academy.everyonecodes.java.week7.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;


public class AnimalsContainsTest {

    StreamFileReader reader = new StreamFileReader();
    FileLineAppender appender = new FileLineAppender();
    FileReader fileReader = new FileReader();
    String pathInput = "src/academy/everyonecodes/java/week7/set2/files/animals.txt";
    String pathOutput = "src/academy/everyonecodes/java/week7/set2/files/animals-s.txt";
    String pathExpected = "src/academy/everyonecodes/java/week7/set2/files/animals-s_expected.txt";

    @Test
    void test() {
        reader.readLines(pathInput)
                .filter(animal -> animal.contains("s") || animal.contains("S"))
                .map(String::toUpperCase)
                .forEach(animal -> appender.append(pathOutput, animal));

        List<String> result = fileReader.read(pathOutput);
        List<String> expected = fileReader.read(pathExpected);
        Assertions.assertEquals(expected, result);


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

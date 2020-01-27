package academy.everyonecodes.java.week5.filesExamples.example2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnimalWriterTest {

    AnimalWriter writer = new AnimalWriter();
    FileReader reader = new FileReader();
    String contentRootPath = "src/academy/everyonecodes/java/week5/examples2/files/newanimals.txt";

    @Test
    void writeWritesToAnimalFile() {
        List<String> animals = List.of("Elephant", "Snail", "Ant");

        writer.write(animals);
        List<String> result = reader.read(contentRootPath);

        List<String> expected = List.of("Elephant", "Snail", "Ant");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void writeAppendsToAnimalFile() {
        List<String> firstAnimals = List.of("Elephant", "Snail", "Ant");
        List<String> secondAnimals = List.of("Tiger");

        writer.write(firstAnimals);
        writer.write(secondAnimals);
        List<String> result = reader.read(contentRootPath);

        List<String> expected = List.of("Elephant", "Snail", "Ant", "Tiger");
        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    void deleteNewAnimalsFile() {
        Path path = Path.of(contentRootPath);
        try {
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

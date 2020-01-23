package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeadCharactersExtractorTest {
    DeadCharactersExtractor extractor = new DeadCharactersExtractor();
    FileReader reader = new FileReader();

    @Test
    void extractTest() {
        extractor.extract();
        List<String> result = reader.read("src/academy/everyonecodes/java/week5/set2/files/deaths.txt");
        List<String> expected = reader.read("src/academy/everyonecodes/java/week5/set2/files/stringlengths_expected.txt");

        Assertions.assertEquals(expected, result);
    }
}
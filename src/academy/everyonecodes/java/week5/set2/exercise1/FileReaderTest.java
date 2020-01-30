package academy.everyonecodes.java.week5.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FileReaderTest {
    FileReader reader = new FileReader();

    @Test
    void readerWithInput() {
        String input = "src/academy/everyonecodes/java/week5/set2/files/document.txt";

        List<String> result = reader.read(input);

        List<String> expected = List.of("line 1;part 1-2", "line 2;part 2-2", "line 3;part 3-2");

        Assertions.assertEquals(expected, result);
    }

     @Test
    void readerWithEmpty() {
        String input = "src/academy/everyonecodes/java/week5/set2/files/documentEmpty.txt";

        List<String> result = reader.read(input);

        List<String> expected = List.of();

        Assertions.assertEquals(expected, result);
    }

 @Test
    void readerWithNoExistingDocument() {
        String input = "src/academy/everyonecodes/java/week5/set2/files/documentNoExisting.txt";

        List<String> result = reader.read(input);

        List<String> expected = List.of();

        Assertions.assertEquals(expected, result);
    }

}

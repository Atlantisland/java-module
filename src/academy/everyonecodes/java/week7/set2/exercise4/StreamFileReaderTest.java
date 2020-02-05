package academy.everyonecodes.java.week7.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StreamFileReaderTest {
    StreamFileReader readerLines = new StreamFileReader();

    @Test
    void readerLinesWithInput() {
        String input = "src/academy/everyonecodes/java/week7/set2/files/animals.txt";

        List<String> result = readerLines.readLines(input)
                .collect(Collectors.toList());


        List<String> expected = List.of("Giraffe", "Lion", "Fish", "Tiger", "Snake", "Dog", "Horse", "Cat", "Snail", "Mouse");

        Assertions.assertEquals(expected, result);
    }

}
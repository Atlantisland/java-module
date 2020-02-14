package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class PokemonFileReaderTest {
    PokemonFileReader readerLines = new PokemonFileReader();

    @Test
    void readerLinesWithInput() {
        String input = "src/academy/everyonecodes/java/week7/voluntaryExercises/files/animals.txt";

        List<String> result = readerLines.readLines(input)
                .collect(Collectors.toList());


        List<String> expected = List.of("Giraffe", "Lion", "Fish", "Tiger", "Snake", "Dog", "Horse", "Cat", "Snail", "Mouse");

        Assertions.assertEquals(expected, result);
    }

}
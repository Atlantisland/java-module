package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {
    VowelCounter counter = new VowelCounter();

    @ParameterizedTest
    @CsvSource({
            "3, handout",
            "2, theory",
            "0, ''",
            "0, dcdkp",
            "2, Use"

    })
    void count(int expected, String input) {
        int result = counter.count(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getLettersTestOne(){
        String word = "";
        List<String> result = counter.getLetters(word);

        List<String> expected = List.of("");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void getLettersTestTwo(){
        String word = "evaluation";
        List<String> result = counter.getLetters(word);

        List<String> expected = List.of("e", "v", "a", "l", "u", "a", "t", "i", "o", "n");
        Assertions.assertEquals(expected, result);
    }

}
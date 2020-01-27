package academy.everyonecodes.java.week5.filesExamples.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NameReaderTest {
    NameReader reader = new NameReader();


    @Test
    void readReturnsJonah() {
        Optional<String> oResult = reader.read();

        Assertions.assertTrue(oResult.isPresent());
        String expected = "Jonah";
        Assertions.assertEquals(expected, oResult.get());


    }
}
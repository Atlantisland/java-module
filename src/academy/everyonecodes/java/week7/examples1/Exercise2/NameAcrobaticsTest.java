package academy.everyonecodes.java.week7.examples1.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class NameAcrobaticsTest {

    @Test
    void test() {
        Optional<String> oResult = Stream.of("Rodrigo", "Lisa", "Rosa")
                .filter(name -> name.endsWith("sa"))
                .map(name -> name.replaceAll("a", "e"))
                .map(name -> name.toUpperCase())
                .findFirst();

        String expected = "LISE";
        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals(expected, oResult.get());
    }
}

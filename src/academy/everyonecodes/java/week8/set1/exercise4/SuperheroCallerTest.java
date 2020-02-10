package academy.everyonecodes.java.week8.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SuperheroCallerTest {
    SuperheroCaller caller = new SuperheroCaller();

    private static Stream<Arguments> parameters() {
        Superhero batman = new Batman();
        Superhero superman = new Superman();
        Superhero spiderman = new Spiderman();
        return Stream.of(
                Arguments.of(Optional.of(batman), "Bruce Wayne"),
                Arguments.of(Optional.of(batman), "Batman"),
                Arguments.of(Optional.of(superman), "Kal-El"),
                Arguments.of(Optional.of(superman), "Superman"),
                Arguments.of(Optional.of(spiderman), "Peter Parker"),
                Arguments.of(Optional.of(spiderman), "Spiderman"));

    }

    @ParameterizedTest
    @MethodSource("parameters")
    void test(Optional<Superhero> oExpected, String input) {
        Optional<Superhero> oResult = caller.findSuperhero(input);
        assertTrue(oResult.isPresent());
        Assertions.assertEquals(oExpected.get(), oResult.get());
    }

    @ParameterizedTest
    @CsvSource({
            "Kal",
            "super",
            "''"
    })

    void testEmptyOptional(String input){
        Optional<Superhero> oResult = caller.findSuperhero(input);
        assertTrue(oResult.isEmpty());
    }


}
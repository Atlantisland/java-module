package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class PokemonDataParserTest {
    PokemonDataParser parser = new PokemonDataParser();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(Pokemon expected, String input) {
        Pokemon result = parser.parseLine(input);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        Pokemon expectedFirst = new Pokemon("Bulbasaur", "Grass", Optional.of("Poison"), 318, 45, 49, 49, 65, 65, 45, 1, false);
        Pokemon expectedSecond = new Pokemon("Ivysaur", "Grass", Optional.of("Poison"), 405, 60, 62, 63, 80, 80, 60, 1, false);
        Pokemon expectedThird = new Pokemon("Charmander", "Fire", Optional.empty(), 309, 39, 52, 43, 60, 50, 65, 1, false);

        return Stream.of(
                Arguments.of(expectedFirst, "1,Bulbasaur,Grass,Poison,318,45,49,49,65,65,45,1,False"),
                Arguments.of(expectedSecond, "2,Ivysaur,Grass,Poison,405,60,62,63,80,80,60,1,False"),
                Arguments.of(expectedThird, "4,Charmander,Fire,,309,39,52,43,60,50,65,1,False")

        );

    }

}




package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class PokemonDataReaderTest {

    PokemonDataParser parser = new PokemonDataParser();

    @ParameterizedTest
    @MethodSource("parameters")
    void test(String input, Pokemon expected){
        Pokemon result = parser.parseLine(input);

        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> parameters(){
        return Stream.of(
                Arguments.of(
                        "1,Bulbasaur,Grass,Poison,318,45,49,49,65,65,45,1,false",
                        new Pokemon("Bulbasaur", "Grass", Optional.of("Poison"), 318,45,49,49,65,65,45,1,false)

                ),
                Arguments.of("4,Charmander,Fire,,309,39,52,43,60,50,65,1,False",
                        new Pokemon("Charmander", "Fire", Optional.empty(),309,39,52,43,60,50,65,1,false))
        );
    }

}
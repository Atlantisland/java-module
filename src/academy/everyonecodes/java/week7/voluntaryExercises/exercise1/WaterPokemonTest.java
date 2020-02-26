package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WaterPokemonTest {
    WaterPokemon finder = new WaterPokemon();

    @Test
    void test() {
        long result = finder.findWaterPokemon();
        long expected = 126;
        System.out.println(result);
        Assertions.assertEquals(expected, result);
    }
}
package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokemonWithCTest {
    PokemonWithC counter = new PokemonWithC();

    @Test
    void count() {
        int result = counter.count();
        int expected = 58;
        Assertions.assertEquals(expected, result);
    }

}
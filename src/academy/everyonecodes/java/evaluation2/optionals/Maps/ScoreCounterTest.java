package academy.everyonecodes.java.evaluation2.optionals.Maps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

class ScoreCounterTest {
    ScoreCounter counter = new ScoreCounter();

    @Test
    void testOneWinner(){
        Map<String, Integer> input = Map.of("Hansel", 3, "Matilda", 2, "Derek", 1);
        String result = counter.getWinner();
        String expected = "Hansel";
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testTwoPlayersWithSameMaxScore(){
        Map<String, Integer> input = Map.of("Hansel", 2, "Matilda", 2, "Derek", 1);
        String result = counter.getWinner();
        String expected = "Hansel";
        Assertions.assertEquals(expected, result);
    }

}
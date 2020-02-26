package academy.everyonecodes.java.week7.voluntaryExercises.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Top5ScoreFinderTest {
    Top5ScoreFinder finder = new Top5ScoreFinder();

    @Test

    void find(){
        List<String> result = finder.find();

        List<String> expected = List.of("MewtwoMega Mewtwo X", "MewtwoMega Mewtwo Y", "RayquazaMega Rayquaza", "KyogrePrimal Kyogre", "GroudonPrimal Groudon");
        Assertions.assertEquals(expected, result);
    }

}
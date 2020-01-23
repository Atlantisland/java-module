package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;


class HappinessScoreFinderTest {
    HappinessScoreFinder happinessScoreFinder = new HappinessScoreFinder();
    HappinessRecord Lesotho = new HappinessRecord("Lesotho", 139, 3.80800008773804);
    HappinessRecord Guinea = new HappinessRecord("Guinea", 149, 3.50699996948242);
    List<HappinessRecord> input = List.of(Lesotho, Guinea);


    @Test
    void findForTestOne() {
        double expected = 3.80800008773804;
        double result = happinessScoreFinder.findFor(input, "Lesotho").get();
        Assertions.assertEquals(expected, result);


    }

    @Test
    void findForTestTwo() {
        double expected = 3.50699996948242;
        double result = happinessScoreFinder.findFor(input, "Guinea").get();
        Assertions.assertEquals(expected, result);


    }

    @Test
    void findForNotRespectiveScore() {
        double expected = 3.80800008773804;
        double result = happinessScoreFinder.findFor(input, "Guinea").get();
        Assertions.assertNotEquals(expected, result);

    }

     @Test
    void findForNotRespectiveCountry() {
        double expected = 3.80800008773804;
        Optional<Double> oResult = happinessScoreFinder.findFor(input, "Germany");
        Assertions.assertTrue(oResult.isEmpty());

    }

}



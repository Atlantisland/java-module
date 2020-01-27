package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

class HappinessDataParserTest {

    HappinessDataParser parser = new HappinessDataParser();

    @ParameterizedTest
    @CsvSource({
            "Lesotho, 139, 3.80800008773804, Lesotho;139;3.80800008773804;4.04434397548437;3.5716561999917;0.521021246910095;1.19009518623352;0;0.390661299228668;0.157497271895409;0.119094640016556;1.42983531951904",
            "Belgium, 17, 6.89099979400635, Belgium;17;6.89099979400635;;;;;;;;;"
    })
    void parseLineReturnsValuesFor(String country, int rank, double score, String line) {
        Optional<HappinessRecord> oResult = parser.parseLine(line);

        Assertions.assertTrue(oResult.isPresent());
        HappinessRecord result = oResult.get();
        HappinessRecord expected = new HappinessRecord(country, rank, score);
        assertRecordEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "Belgium;wrong;6.89099979400635;;;;;;;;;",
            "Belgium;wrong;6.89099979400635",
            "Germany;12;wrong",
            "Germany;wrong;wrong",
    })
    void parseLineReturnsEmptyOptionalFor(String line) {
        Optional<HappinessRecord> oResult = parser.parseLine(line);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @ParameterizedTest
    @CsvSource({
            "bad, 5",
            "2, bad",
            "bad, also bad",
    })
    void parseValuesReturnsEmptyOptionalsFor(String rankString, String scoreString) {
        String country = "Austria";

        Optional<HappinessRecord> oResult = parser.parseValues(country, rankString, scoreString);

        Assertions.assertTrue(oResult.isEmpty());
    }

    @ParameterizedTest
    @CsvSource({
            "1, 0, 1, 0",
            "3, 4.2349, 3, 4.2349",
            "0, 0, 0, 0",
    })
    void parseValuesReturnsHappinessRecordFor(int expectedRank, double expectedScore, String rankString, String scoreString) {
        String country = "Austria";

        Optional<HappinessRecord> oResult = parser.parseValues(country, rankString, scoreString);

        Assertions.assertTrue(oResult.isPresent());
        HappinessRecord result = oResult.get();
        HappinessRecord expected = new HappinessRecord("Austria", expectedRank, expectedScore);
        assertRecordEquals(expected, result);
    }

    private void assertRecordEquals(HappinessRecord expected, HappinessRecord actual) {
        Assertions.assertEquals(expected.getCountry(), actual.getCountry());
        Assertions.assertEquals(expected.getRank(), actual.getRank());
        Assertions.assertEquals(expected.getScore(), actual.getScore());
    }
}




/*class HappinessDataParserTest {
    HappinessDataParser parser = new HappinessDataParser();

    @Test
    void parserTestOne() {
        String input = "Lesotho;139;3.80800008773804;4.04434397548437;3.5716561999917;0.521021246910095;1.19009518623352;0;0.390661299228668;0.157497271895409;0.119094640016556;1.42983531951904";
        Optional<HappinessRecord> oResult = parser.parseLine(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals("Lesotho", oResult.get().getCountry());
        Assertions.assertEquals(3.80800008773804, oResult.get().getScore());
        Assertions.assertEquals(139, oResult.get().getRank());
    }

    @Test
    void parserTestTwo() {
        String input = "Guinea;149;3.50699996948242;3.58442812889814;3.4295718100667;0.244549930095673;0.791244685649872;0.194129139184952;0.348587512969971;0.264815092086792;0.110937617719173;1.55231189727783";
        Optional<HappinessRecord> oResult = parser.parseLine(input);

        Assertions.assertTrue(oResult.isPresent());
        Assertions.assertEquals("Guinea", oResult.get().getCountry());
        Assertions.assertEquals(3.50699996948242, oResult.get().getScore());
        Assertions.assertEquals(149, oResult.get().getRank());
    }


    @Test
    void parserTestWithEmpty() {
        String input = "";
        Optional<HappinessRecord> oResult = parser.parseLine(input);

        Assertions.assertTrue(oResult.isEmpty());

    }

}*/


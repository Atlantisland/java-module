package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


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
        assertEquals(expected, result);
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
        assertEquals(expected, result);
    }


}



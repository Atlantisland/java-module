package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;


class HappinessDataParserTest {
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

}


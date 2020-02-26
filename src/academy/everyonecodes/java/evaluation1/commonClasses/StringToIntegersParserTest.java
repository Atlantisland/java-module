package academy.everyonecodes.java.evaluation1.commonClasses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StringToIntegersParserTest {
    StringToIntegersParser stringToIntegersParser = new StringToIntegersParser();

    @Test
    void parse(){
        String input = "1 2 3 4";
        List<Integer> expected = List.of(1,2,3,4);
        List<Integer> result = stringToIntegersParser.parse(input);

        Assertions.assertEquals(expected, result);
    }
    @Test
    void parseNegativeNumber(){
        String input = "-1 4 0";
        List<Integer> expected = List.of(-1, 4, 0);
        List<Integer> result = stringToIntegersParser.parse(input);

        Assertions.assertEquals(expected, result);
    }
    @Test
    void parseReturnsEmptyList(){
        String input = "2 3";
        List<Integer> expected = List.of(2,3);
        List<Integer> result = stringToIntegersParser.parse(input);

        Assertions.assertEquals(expected, result);
    }

}
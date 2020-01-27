package academy.everyonecodes.java.week5.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinesCalculatorTest {
    LinesCalculator calculator = new LinesCalculator();

    @Test
    void calculateReturnsEmptyListForEmptyList(){
        List<String> input = List.of();

        List<String> result = calculator.calculate(input);

        Assertions.assertEquals(0, result.size());
    }

    @Test
    void calculateReturnsSumOfSingleEntryForListWithOneEntry() {
        List<String> input = List.of("-1;4;0");

        List<String> result = calculator.calculate(input);

        List<String> expected = List.of("3");
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "0, '0;0'",
            "1, '1;0'",
            "-2, '-1;-1'"
    })
    void sumOne(String expected, String input){
        String result = calculator.sumOne(input);
        assertEquals(expected, result);
    }






}
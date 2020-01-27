package academy.everyonecodes.java.week4.exampleSet1.example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DataReaderTest {
    DataReader dataReader = new DataReader();

    @Test
    void readReturnsEmptyListForEmptyStrings() {
        String input = ",,";
        List<String> result = dataReader.read(input);

        Assertions.assertEquals(0, result.size());
    }

    @Test
    void readReturnsUppercaseValuesForRegularData() {
        String input = "first,second,third";
        List<String> result = dataReader.read(input);

        List<String> expected = List.of("FIRST", "SECOND", "THIRD");
        Assertions.assertEquals(expected, result);
    }

    @Test
    void readReturnsStringValuesForStringThatAreNumbers() {
        String input = "1,2,3";
        List<String> result = dataReader.read(input);

        List<String> expected = List.of("1", "2", "3");
        Assertions.assertEquals(expected, result);
    }

}
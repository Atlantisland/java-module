package academy.everyonecodes.java.week5.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class HappinessDataReaderTest {
    HappinessDataReader happinessDataReader = new HappinessDataReader();

    @Test
    void readFirstLine() {
        List<HappinessRecord> scores = happinessDataReader.read();

        HappinessRecord result = scores.get(0);
        HappinessRecord expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        Assertions.assertEquals(expected.getCountry(), result.getCountry());
        Assertions.assertEquals(expected.getRank(), result.getRank());
        Assertions.assertEquals(expected.getScore(), result.getScore());
    }

}
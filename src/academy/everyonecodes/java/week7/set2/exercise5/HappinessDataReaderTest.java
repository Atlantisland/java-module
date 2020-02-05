package academy.everyonecodes.java.week7.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class HappinessDataReaderTest {
    HappinessDataReader reader = new HappinessDataReader();

    @Test
    void readReturnsCorrectData() {
        List<HappinessRecord> result = reader.read();

        int expectedSize = 155;
        Assertions.assertEquals(expectedSize, result.size());

        HappinessRecord expectedFirst = new HappinessRecord("Lesotho", 139, 3.80800008773804);
        HappinessRecord resultFirst = result.get(0);
        Assertions.assertEquals(expectedFirst, resultFirst);

        HappinessRecord expectedLast = new HappinessRecord("Ireland", 15, 6.97700023651123);
        HappinessRecord resultLast = result.get(result.size() - 1);
        Assertions.assertEquals(expectedLast, resultLast);

    }
}

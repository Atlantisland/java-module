package academy.everyonecodes.java.week5.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class GotDataReaderTest {
    GotDataReader reader = new GotDataReader();

    @Test
    void readTest() {
        Character expected = new Character("Addam Marbrand", "", "male");
        String input = "src/academy/everyonecodes/java/week5/set2/files/got-characters.csv";
        List<Character> resultedList = reader.read(input);
        Character result = resultedList.get(0);

        Assertions.assertEquals(expected.getName(), result.getName());

    }
}

package academy.everyonecodes.java.week9.Examples2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperworkOfficialTest {

    PaperworkOfficial official = new PaperworkOfficial("Franz Schmidt");

    @Test
    void introduce() {
        String result = official.introduce();

        String expected = "Hello, my name is Franz Schmidt";
        assertEquals(expected, result);
    }

    @Test
    void describeWork() {
        String result = official.describeWork();

        String expected = "This difficult task will take me at least 5-7 working days.";
        assertEquals(expected, result);
    }

}
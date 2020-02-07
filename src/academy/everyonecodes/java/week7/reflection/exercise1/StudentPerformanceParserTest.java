package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StudentPerformanceParserTest {

    StudentPerformanceParser parser = new StudentPerformanceParser();

    @ParameterizedTest
    @CsvSource({
            "female, bachelor's degree, 72, 72, 74, female;bachelor's degree;72;72;74",

    })
    void parseLineReturnsValueFor(String gender, String parentalEducation, int mathScore, int readingScore, int writingScore, String line) {
        StudentPerformance result = parser.parseLine(line);

        StudentPerformance expected = new StudentPerformance("female", "bachelor's degree", 72, 72, 74);
        assertEquals(expected, result);
    }

}


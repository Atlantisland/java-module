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

/*
package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StudentPerformanceParserTest {

   StudentPerformanceParser parser = new StudentPerformanceParser();

   @ParameterizedTest
   @MethodSource("validLines")
   void parseLineReturnsStudentPerformanceFor(String line, StudentPerformance expected) {
       Optional<StudentPerformance> oResult = parser.parseLine(line);

       assertTrue(oResult.isPresent());
       assertEquals(expected, oResult.get());
   }

   private static Stream<Arguments> validLines() {
       return Stream.of(
               Arguments.of("male;high school;72;65;68",
                   new StudentPerformance("male", "high school", 72, 65, 68)
               ),
               Arguments.of("female;associate's degree;68;77;80",
                   new StudentPerformance("female", "associate's degree", 68, 77, 80)
               )
       );
   }

   @ParameterizedTest
   @MethodSource("invalidLines")
   void parseLineReturnsEmptyFor(String line) {
       Optional<StudentPerformance> oResult = parser.parseLine(line);

       assertTrue(oResult.isEmpty());
   }

   private static Stream<Arguments> invalidLines() {
       return Stream.of(
               Arguments.of(""),
               Arguments.of(";;;;"),
               Arguments.of("male;high school;72;65"),
               Arguments.of("female;associate's degree;wrong;80;12")
       );
   }

   @ParameterizedTest
   @MethodSource("validElementLists")
   void parseValuesReturnsStudentPerformanceFor(List<String> elements, StudentPerformance expected) {
       Optional<StudentPerformance> oResult = parser.parseValues(elements);

       assertTrue(oResult.isPresent());
       assertEquals(expected, oResult.get());
   }

   private static Stream<Arguments> validElementLists() {
       return Stream.of(
               Arguments.of(
                       List.of("male", "high school", "72", "65", "68"),
                       new StudentPerformance("male", "high school", 72, 65, 68)
               ),
               Arguments.of(
                       List.of("female", "associate's degree", "68", "77", "80"),
                       new StudentPerformance("female", "associate's degree", 68, 77, 80)
               )
       );
   }

   @ParameterizedTest
   @MethodSource("invalidElementLists")
   void parseValuesReturnsEmptyFor(List<String> elements) {
       Optional<StudentPerformance> oResult = parser.parseValues(elements);

       assertTrue(oResult.isEmpty());
   }

   private static Stream<Arguments> invalidElementLists() {
       return Stream.of(
               Arguments.of(List.of("female", "associate's degree", "", "", "")),
               Arguments.of(List.of("female", "associate's degree", "", "77", "80")),
               Arguments.of(List.of("female", "associate's degree", "", "", "80")),
               Arguments.of(List.of("female", "associate's degree", "", "77", "")),
               Arguments.of(List.of("female", "associate's degree", "21", "77", "")),
               Arguments.of(List.of("female", "associate's degree", "21", "", ""))
       );
   }
}

 */


package academy.everyonecodes.java.week7.reflection.exercise1;


import java.util.List;

public class StudentPerformanceParser {

    public StudentPerformance parseLine(String line) {
        List<String> elements = List.of(line.split(";", -1));
        String genderIndex = elements.get(0);
        String parentalEducationIndex = elements.get(1);
        int mathScoreIndex = Integer.parseInt(elements.get(2));
        int readingScoreIndex = Integer.parseInt(elements.get(3));
        int writingScoreIndex = Integer.parseInt(elements.get(4));
        StudentPerformance studentPerformance = new StudentPerformance(genderIndex, parentalEducationIndex, mathScoreIndex, readingScoreIndex, writingScoreIndex);
        return studentPerformance;
    }

}

/*
package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.List;
import java.util.Optional;

public class StudentPerformanceParser {

   private int elementsPerLine = 5;

   public Optional<StudentPerformance> parseLine(String line) {
       List<String> elements = List.of(line.split(";", -1));
       if (elements.size() != elementsPerLine) {
           return Optional.empty();
       }
       return parseValues(elements);
   }

   Optional<StudentPerformance> parseValues(List<String> elements) {
       try {
           int mathScore = Integer.parseInt(elements.get(2));
           int readingScore = Integer.parseInt(elements.get(3));
           int writingScore = Integer.parseInt(elements.get(4));
           StudentPerformance value = new StudentPerformance(
                   elements.get(0),
                   elements.get(1),
                   mathScore,
                   readingScore,
                   writingScore
           );
           return Optional.of(value);
       } catch (NumberFormatException e) {
           e.printStackTrace();
           return Optional.empty();
       }
   }
}

 */

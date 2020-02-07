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

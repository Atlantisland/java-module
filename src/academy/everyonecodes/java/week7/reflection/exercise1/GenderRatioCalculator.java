package academy.everyonecodes.java.week7.reflection.exercise1;

public class GenderRatioCalculator {
    StudentPerformanceReader reader = new StudentPerformanceReader();

    public String calculate() {
        return "Gender ratio: " + calculateFemale() + " : " + calculateMale();

    }

    long calculateFemale() {
        return reader.read().stream()
                .filter(element -> element.getGender().equals("female"))
                .count();
    }

    long calculateMale() {
        return reader.read().stream()
                .filter(element -> element.getGender().equals("male"))
                .count();
    }
}

/*
package academy.everyonecodes.java.week7.reflection.exercise1;

import java.util.List;

public class GenderRatioCalculator {

   StudentPerformanceReader reader = new StudentPerformanceReader();

   public String calculate() {
       List<StudentPerformance> data = reader.read();
       long femaleCount = data.stream()
               .filter(element -> element.getGender().equals("female"))
               .count();
       long maleCount = data.size() - femaleCount;
       return femaleCount + ":" + maleCount;
   }
}

 */

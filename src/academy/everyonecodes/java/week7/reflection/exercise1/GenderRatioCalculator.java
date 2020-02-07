package academy.everyonecodes.java.week7.reflection.exercise1;

public class GenderRatioCalculator {
    StudentPerformanceReader reader = new StudentPerformanceReader();

    public String calculate() {
        String genderRatio = "Gender ratio: ";
        String female = String.valueOf(calculateFemale());
        String male = String.valueOf(calculateMale());

        return genderRatio + female + " : " + male;

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

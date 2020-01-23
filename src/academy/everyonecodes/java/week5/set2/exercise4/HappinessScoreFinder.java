package academy.everyonecodes.java.week5.set2.exercise4;


import java.util.List;
import java.util.Optional;


public class HappinessScoreFinder {

    public Optional<Double> findFor(List<HappinessRecord> happinessRecordList, String country) {
        for (HappinessRecord score : happinessRecordList) {
            if (score.getCountry().equals(country)) {
                return Optional.of(score.getScore());
            }
        }
        return Optional.empty();
    }
}








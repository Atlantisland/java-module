package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessTopThreeFinder {
    HappinessDataReader reader = new HappinessDataReader();

    public List<String> findTopThree() {
        List<HappinessRecord> records = reader.read();
        return records.stream()
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(3)
                .map(record -> "Country: " + record.getCountry() + " Score: " + record.getScore())
                .collect(Collectors.toList());
    }

}


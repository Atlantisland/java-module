package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HappinessSpecialFiveFinder {
    HappinessDataReader reader = new HappinessDataReader();

    public List<String> findSpecialFive() {
        List<HappinessRecord> records = reader.read();
        return records.stream()
                .sorted(Comparator.comparing(HappinessRecord::getRank)
                        .reversed())
                .filter(record -> record.getCountry().contains("a"))
                .filter(record -> record.getCountry().length() > 9)
                .limit(5)
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .map(record -> "Country: " + record.getCountry() + " Rank: " + record.getRank())
                .collect(Collectors.toList());
    }
}


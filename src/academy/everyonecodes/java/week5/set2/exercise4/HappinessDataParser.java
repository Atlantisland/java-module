package academy.everyonecodes.java.week5.set2.exercise4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class HappinessDataParser {

    public Optional<HappinessRecord> parseLine(String input) {

        List<String> data = Arrays.asList(input.split(";", -1));
        String country = data.get(0);
        int rank = Integer.valueOf(data.get(1));
        Double score = Double.valueOf(data.get(2));
        HappinessRecord currentHappinessRecord = new HappinessRecord(country, rank, score);
        if (data.size()>2) {
            return Optional.of(currentHappinessRecord);
        }
        return Optional.empty();

    }
}

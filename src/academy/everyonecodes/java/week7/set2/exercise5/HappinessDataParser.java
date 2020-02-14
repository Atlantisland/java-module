package academy.everyonecodes.java.week7.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class HappinessDataParser {

    private int elementsPerLine = 12;
    private int countryIndex = 0;
    private int rankIndex = 1;
    private int scoreIndex = 2;

    public Optional<HappinessRecord> parseLine(String line) {
        List<String> elements = List.of(line.split(";", -1));
        if (elements.size() != elementsPerLine) {
            return Optional.empty();
        }
        return parseValues(elements.get(countryIndex), elements.get(rankIndex), elements.get(scoreIndex));
    }

    Optional<HappinessRecord> parseValues(String country, String rankString, String scoreString) {
        try {
            int rank = Integer.valueOf(rankString);
            double score = Double.valueOf(scoreString);
            HappinessRecord record = new HappinessRecord(country, rank, score);
            return Optional.of(record);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }
}


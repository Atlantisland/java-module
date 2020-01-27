package academy.everyonecodes.java.week5.set2.exercise4;


import java.util.List;
import java.util.Optional;

public class HappinessDataParser {
    private int dataPerLine = 12;
    private int countryIndex = 0;
    private int rankIndex = 1;
    private int scoreIndex = 2;

    public Optional<HappinessRecord> parseLine(String input) {

        List<String> data = List.of(input.split(";", -1));
        if (data.size() != dataPerLine) {
            return Optional.empty();
        }
        return parseValues(data.get(countryIndex), data.get(rankIndex), data.get(scoreIndex));
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

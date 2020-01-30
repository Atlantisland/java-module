package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class GotDataParser {

    public Character parseLine(String line) {
        List<String> columns = getColumns(line);
        return createCharacter(columns);
    }

    private List<String> getColumns(String line) {
        return List.of(line.split(";"));
    }

    private Character createCharacter(List<String> columns) {
        return new Character(
                columns.get(0),
                getBookOfDeath(columns.get(3)),
                columns.get(7)
        );
    }

    private Optional<String> getBookOfDeath(String bookOfDeath) {
        if (bookOfDeath.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(bookOfDeath);
    }
}
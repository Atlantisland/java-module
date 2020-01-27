package academy.everyonecodes.java.week5.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HappinessDataReader {

    private String path = "src/academy/everyonecodes/java/week5/set2/files/world-happiness-2017.csv";
    private FileReader reader = new FileReader();
    private HappinessDataParser parser = new HappinessDataParser();

    public List<HappinessRecord> read() {
        List<String> lines = reader.read(path);
        List<HappinessRecord> records = new ArrayList<>();
        for (String line : lines) {
            Optional<HappinessRecord> oRecord = parser.parseLine (line);
            if (oRecord.isEmpty()) {
                continue;
            }
            records.add(oRecord.get());
        }
        return records;
    }
}

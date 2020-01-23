package academy.everyonecodes.java.week5.set2.exercise4;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HappinessDataReader {

    private String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/world-happiness-2017.csv";
    FileReader reader = new FileReader();

    public List<HappinessRecord> read() {
        Path path = Path.of(contentRootPath);
        List<HappinessRecord> happinessRecordList = new ArrayList<>();
        HappinessDataParser happinessDataParser = new HappinessDataParser();

        try {
            List<String> lines = Files.readAllLines(path);
            for (int i = 1; i < lines.size(); i++) {
                HappinessRecord currentHappinessRecord = happinessDataParser.parseLine(lines.get(i)).get();
                happinessRecordList.add(currentHappinessRecord);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return happinessRecordList;
    }
}

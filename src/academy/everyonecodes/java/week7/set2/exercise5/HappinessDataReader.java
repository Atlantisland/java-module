package academy.everyonecodes.java.week7.set2.exercise5;

import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HappinessDataReader {
    private String file = "src/academy/everyonecodes/java/week7/set2/files/world-happiness-2017.csv";
    private StreamFileReader streamFileReader = new StreamFileReader();
    private HappinessDataParser parser = new HappinessDataParser();


    public List<HappinessRecord> read() {
        Path path = Path.of(file);
        try {
            return Files.lines(path)
                    .skip(1)
                    .map(line -> parser.parseLine(line)) //map(parser::parseLine)
                    .filter(Optional::isPresent)
                    .map(Optional::get)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

    }
}


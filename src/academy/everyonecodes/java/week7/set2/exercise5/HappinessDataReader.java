package academy.everyonecodes.java.week7.set2.exercise5;

import academy.everyonecodes.java.week7.set2.exercise4.StreamFileReader;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HappinessDataReader {
    private String path = "src/academy/everyonecodes/java/week7/set2/files/world-happiness-2017.csv";
    private StreamFileReader streamFileReader = new StreamFileReader();
    private HappinessDataParser parser = new HappinessDataParser();


    public List<HappinessRecord> read() {
        return streamFileReader.readLines(path)
                .skip(1)
                .map(line -> parser.parseLine(line))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

    }
}


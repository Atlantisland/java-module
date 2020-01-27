package academy.everyonecodes.java.week4.exampleSet1.example1;

import java.util.ArrayList;
import java.util.List;

public class DataReader {
    public List<String> read(String input) {
        List<String> stringsInInput = List.of(input.split(","));
        List<String> stringsUppercase = new ArrayList<>();
        for (String string : stringsInInput) {
            stringsUppercase.add(string.toUpperCase());
        }
        return stringsUppercase;
    }
}

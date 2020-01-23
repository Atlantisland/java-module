package academy.everyonecodes.java.week5.set2.exercise7;

import academy.everyonecodes.java.week5.set2.exercise2.FileWriter;

import java.util.List;

public class LineLengthWriter {
    public void write() {
        LineLengthReader reader = new LineLengthReader();
        IntegerListToStringListConverter converter = new IntegerListToStringListConverter();
        List<Integer> lengths = reader.read();
        List<String> strings = converter.convert(lengths);
        FileWriter writer = new FileWriter();
        String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/stringlengths.txt";
        writer.write(contentRootPath, strings);
    }
}

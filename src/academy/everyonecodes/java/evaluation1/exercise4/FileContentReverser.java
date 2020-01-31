package academy.everyonecodes.java.evaluation1.exercise4;

import academy.everyonecodes.java.evaluation1.commonClasses.FileReader;
import academy.everyonecodes.java.evaluation1.commonClasses.FileWriter;

import java.io.File;
import java.util.Collections;
import java.util.List;


public class FileContentReverser {
    private FileReader reader = new FileReader();
    private FileWriter writer = new FileWriter();
    private String path = "src/academy/everyonecodes/java/evaluation1/files/lines-reversed.txt";

    public void reverse(String pathOne, String pathTwo) {
        List<String> lines = reader.read(pathOne);
        Collections.reverse(lines);
        writer.write(path, lines);
    }
}

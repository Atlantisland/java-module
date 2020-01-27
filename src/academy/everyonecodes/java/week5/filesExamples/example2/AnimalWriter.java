package academy.everyonecodes.java.week5.filesExamples.example2;

import academy.everyonecodes.java.week5.set2.exercise2.FileWriter;

import java.util.List;

public class AnimalWriter {
    FileWriter writer = new FileWriter();
    String contentRootPath = "src/academy/everyonecodes/java/week5/examples2/files/newanimals.txt";

    public void write(List<String> animals) {
        writer.append(contentRootPath, animals);
    }

}

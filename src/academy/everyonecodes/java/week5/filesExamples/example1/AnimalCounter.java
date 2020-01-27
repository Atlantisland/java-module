package academy.everyonecodes.java.week5.filesExamples.example1;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;

import java.util.List;

public class AnimalCounter {
    private FileReader reader = new FileReader();
    private String contentRootPath = "src/academy/everyonecodes/java/week5/examples2/files/animals.txt";

    public int count() {
        List<String> animals = reader.read(contentRootPath);
        return animals.size();
    }

}

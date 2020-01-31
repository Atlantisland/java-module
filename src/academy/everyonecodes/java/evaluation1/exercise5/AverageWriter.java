package academy.everyonecodes.java.evaluation1.exercise5;

import academy.everyonecodes.java.evaluation1.commonClasses.FileReader;
import academy.everyonecodes.java.evaluation1.commonClasses.FileWriter;

import java.util.ArrayList;
import java.util.List;

public class AverageWriter {
    private FileReader reader = new FileReader();
    private FileWriter writer = new FileWriter();

    public void write(String pathOne, String pathTwo) {
        List<String> numbers = reader.read(pathOne);
        List<String> numbersCopy = new ArrayList<>(numbers);
        List<Double> averages = new ArrayList<>();
        double average = 0.0;
        for (Integer numberCopy : numbersCopy) {
            average = numberCopy / numberCopy.length();
            averages.add(average);

        }

    }
}

//due to time i cnanot continue. however after creating the numberscopy list there must be a loop
//the string lines are transformed into numbers in order int the above loop to calcualte the average
//of the numbers in each line.

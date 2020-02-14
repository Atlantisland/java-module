package academy.everyonecodes.java.evaluation1.exercise5;

import academy.everyonecodes.java.evaluation1.commonClasses.FileReader;
import academy.everyonecodes.java.evaluation1.commonClasses.FileWriter;

import java.util.ArrayList;
import java.util.List;

public class AverageWriter {
    private FileReader reader = new FileReader();
    private FileWriter writer = new FileWriter();
    private LineAverageCalculator calculator = new LineAverageCalculator();

    public void write(String pathOne, String pathTwo) {
        List<String> lines = reader.read(pathOne);
        List<String> averages = getAverages(lines);
        writer.write(pathTwo, averages);
    }

    private List<String> getAverages(List<String> lines) {
        List<String> averages = new ArrayList<>();
        for (String line : lines) {
            String average = calculator.calculate(line);
            averages.add(average);
        }
        return averages;

    }
}





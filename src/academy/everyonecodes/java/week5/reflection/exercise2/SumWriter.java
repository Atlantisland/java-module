package academy.everyonecodes.java.week5.reflection.exercise2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import academy.everyonecodes.java.week5.set2.exercise2.FileWriter;

import java.util.List;

public class SumWriter {
    private FileReader reader = new FileReader();
    private LinesCalculator linesCalcualtor = new LinesCalculator();
    private FileWriter writer = new FileWriter();
    private String inputPath = "src/academy/everyonecodes/java/week5/reflection/files/input.csv";
    private String outputPath = "src/academy/everyonecodes/java/week5/reflection/files/output.csv";

    public void write() {
        List<String> inputLines = reader.read(inputPath);
        List<String> outputLines = linesCalcualtor.calculate(inputLines);
        writer.write(outputPath, outputLines);
    }
}

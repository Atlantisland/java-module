package academy.everyonecodes.java.week4.exampleSet1.example2;

public class DateExtractor {

    public String extract(String fileName) {
        int length = fileName.length();
        return fileName.substring(6, length - 4);
    }
}

package academy.everyonecodes.java.week4.exampleSet1.example2;

public class FileNameValidator {
    public boolean validate(String filename) {
        return filename.startsWith("PHOTO") && filename.endsWith(".png");
    }
}

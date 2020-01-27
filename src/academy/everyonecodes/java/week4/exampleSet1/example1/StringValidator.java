package academy.everyonecodes.java.week4.exampleSet1.example1;

public class StringValidator {
    public boolean validate(String value) {
        String trimmed = value.trim();
        return !trimmed.isEmpty();
    }
}

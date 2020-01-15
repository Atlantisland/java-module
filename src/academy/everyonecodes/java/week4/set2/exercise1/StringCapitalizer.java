package academy.everyonecodes.java.week4.set2.exercise1;

public class StringCapitalizer {
    public String capitalize(String text) {
        text = text.trim();
        int length = text.length();
        String firstLetter = text.substring(0, 1);
        firstLetter = firstLetter.toUpperCase();
        String restText = text.substring(1, length);
        String result = firstLetter + restText;
        return result;
    }

}

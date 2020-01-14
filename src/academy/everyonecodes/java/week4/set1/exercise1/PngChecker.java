package academy.everyonecodes.java.week4.set1.exercise1;

public class PngChecker {

    public boolean checker(String filename) {
        int length = filename.length();
        String png = filename.substring(length - 4, length);
        if (png.equalsIgnoreCase(".png")) {
            return true;
        }
        return false;
    }

}


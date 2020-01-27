package academy.everyonecodes.java.week3.set2.exercise6;

public class StringStorageSizeCalculator {
    public int calculate(String string) {
        int hashInBits = 4 * 8;
        int letterInBits = 2 * 8;
        int length = string.length();
        int position = 0;
        int sizeString = hashInBits;
        while(position < length) {
            char letter = string.charAt(position);
            sizeString = sizeString + letterInBits;
            position++;
        }
        return sizeString;

    }

}


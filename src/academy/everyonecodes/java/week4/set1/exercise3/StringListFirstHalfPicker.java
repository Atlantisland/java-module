package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.List;
import java.util.Random;
import java.lang.Math;

public class StringListFirstHalfPicker {

    public String pick(List<String> names) {
        Random random = new Random();
        int size = names.size();
        int end = size / 2;
        int randomIndex = random.nextInt(end);
        return names.get(randomIndex);

    }
}

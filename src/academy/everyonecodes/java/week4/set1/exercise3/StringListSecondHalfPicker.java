package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.List;
import java.util.Random;
import java.lang.Math;

public class StringListSecondHalfPicker {

    public String pick(List<String> names) {
        Random random = new Random();
        double size = names.size();
        double halfSize = size / 2;
        double startPoint = Math.floor(halfSize);
        double indexesCount = Math.ceil(halfSize);
        double randomIndex = random.nextInt((int) indexesCount)+startPoint;
        return names.get((int) randomIndex);

    }
}

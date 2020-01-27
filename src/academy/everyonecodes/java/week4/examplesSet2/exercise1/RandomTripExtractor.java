package academy.everyonecodes.java.week4.examplesSet2.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTripExtractor {
    public List<Integer> extract(List<Integer> numbers) {
        Random random = new Random();
        int size = numbers.size();
        ArrayList<Integer> numbersPicked = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(size);
            numbersPicked.add(numbers.get(randomIndex));
        }
        return numbersPicked;
    }
}

package academy.everyonecodes.java.week4.exampleSet1.example2;

import java.util.List;
import java.util.Random;

public class RandomFileNamePicker {

    public String pick(List<String> filenames) {
        Random random = new Random();
        int size = filenames.size();
        int randomIndex = random.nextInt(size);
        return filenames.get(randomIndex);
    }
}

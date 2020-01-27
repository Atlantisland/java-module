package academy.everyonecodes.java.week4.exampleSet1.example2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class RandomFileNamePickerTest {
    RandomFileNamePicker randomFileNamePicker = new RandomFileNamePicker();

    @Test
    void pickReturnsItemFromList() {
        List<String> filenames = List.of("PHOTO_10012020.png", "PHOTO_11012020.png", "PHOTO_12012020.png");
        String result = randomFileNamePicker.pick(filenames);

        Assertions.assertTrue(filenames.contains(result));
    }

}
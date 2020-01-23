package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.List;
import java.util.Optional;

public class TotalDeathCounter {

    private GotDataReader reader = new GotDataReader();
    private String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/got-characters.csv";

    public int count(List<Character> characterList) {
        int counter = 0;
        for (Character character : characterList) {
            String characterBookOfDeath = character.getBookOfDeath();
            if (!characterBookOfDeath.isEmpty()) {
                counter++;
            }

        }
        return counter;
    }
}
package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise2.FileWriter;

import java.util.ArrayList;
import java.util.List;

public class DeadCharactersExtractor {

    public void extract() {
        GotDataReader reader = new GotDataReader();
        FileWriter writer = new FileWriter();

        String contentRootPath = "src/academy/everyonecodes/java/week5/set2/files/got-characters.csv";

        List<Character> characterList = reader.read(contentRootPath);
        List<String> nameOfDeadCharacterList = new ArrayList<>();
        for (Character character : characterList) {
            String characterBookOfDeath = character.getBookOfDeath();
            if (!characterBookOfDeath.isEmpty()) {
                nameOfDeadCharacterList.add(character.getName());
            }
        }
    }
}
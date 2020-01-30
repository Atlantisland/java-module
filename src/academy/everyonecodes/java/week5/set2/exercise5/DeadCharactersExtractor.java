package academy.everyonecodes.java.week5.set2.exercise5;

import academy.everyonecodes.java.week5.set2.exercise2.FileWriter;

import java.util.ArrayList;
import java.util.List;

public class DeadCharactersExtractor {

    private GotDataReader reader = new GotDataReader();
    private FileWriter writer = new FileWriter();

    public void extract() {
        List<Character> characters = reader.read();
        List<String> names = getDeadCharacterNames(characters);
        write(names);
    }

    private List<String> getDeadCharacterNames(List<Character> characters) {
        List<String> names = new ArrayList<>();
        for (Character character : characters) {
            if (isDead(character)) {
                String name = character.getName();
                names.add(name);
            }
        }
        return names;
    }

    private boolean isDead(Character character) {
        return character.getBookOfDeath().isPresent();
    }

    private void write(List<String> names) {
        String file = "src/academy/everyonecodes/live/files/deaths.txt";
        writer.write(file, names);
    }
}
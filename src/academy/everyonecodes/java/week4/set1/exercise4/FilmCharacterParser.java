package academy.everyonecodes.java.week4.set1.exercise4;

public class FilmCharacterParser {
    public FilmCharacter parse(String input) {
        String[] names = input.split(";");
        String firstName = names[0];
        String lastName = names[1];
        FilmCharacter filmCharacter = new FilmCharacter(firstName, lastName);
        return filmCharacter;

    }

}

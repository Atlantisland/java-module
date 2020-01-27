package academy.everyonecodes.java.week5.optionalsExamples.example1;

public class FilmCharacter {
    private String firstName;
    private String lastName;

    public FilmCharacter(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

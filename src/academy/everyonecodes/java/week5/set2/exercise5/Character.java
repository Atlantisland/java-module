package academy.everyonecodes.java.week5.set2.exercise5;

import java.util.Optional;

public class Character {
    private String name;
    private Optional<Integer> bookOfDeath;
    private String gender;

    public Character(String name, Optional<Integer> bookOfDeath, String gender) {
        this.name = name;
        this.bookOfDeath = bookOfDeath;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Optional<Integer> getBookOfDeath() {
        return bookOfDeath;
    }

    public String getGender() {
        return gender;
    }

}



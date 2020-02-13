package academy.everyonecodes.java.optionals.enums.exercise2;

public enum Headpiece {
    BEANIE("orange beanie with ananas"),
    HAT("red hat with dogs");

    private final String description;


    Headpiece(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}

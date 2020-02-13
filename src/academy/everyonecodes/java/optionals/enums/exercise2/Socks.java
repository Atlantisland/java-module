package academy.everyonecodes.java.optionals.enums.exercise2;

public enum Socks {
    GREENSOCKS("green socks with bananas"),
    YELLOWSOCKS("yellow socks with flamingos"),
    REDSOCKS("red socks with stripes");

    private final String description;


    Socks(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}

package academy.everyonecodes.java.week9.set1.exercise1;

public class Animal {
    private String name;
    private String movement;
    private String kind;

    public Animal(String name, String movement, String kind) {
        this.name = name;
        this.movement = movement;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public String getMovement() {
        return movement;
    }

    public String getKind() {
        return kind;
    }
}

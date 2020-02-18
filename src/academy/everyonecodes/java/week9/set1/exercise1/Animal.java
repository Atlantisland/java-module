package academy.everyonecodes.java.week9.set1.exercise1;

import java.util.List;

public class Animal {
    private String name;
    private List<String> movement;
    private String kind;

    public Animal(String name, List<String> movement, String kind) {
        this.name = name;
        this.movement = movement;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public List<String> getMovement() {
        return movement;
    }

    public String getKind() {
        return kind;
    }
}

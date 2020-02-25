package academy.everyonecodes.java.week10.set1.exercise1.providers;

public abstract class Provider {

    private String name;

    public Provider(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean provides(long creditCardNumber);
}

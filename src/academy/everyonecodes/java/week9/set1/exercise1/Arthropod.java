package academy.everyonecodes.java.week9.set1.exercise1;

public class Arthropod extends Animal {

    private int numberOfLegs;


    public Arthropod(String name, String movement, int numberOfLegs) {
        super(name, movement, "arthropod");
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
